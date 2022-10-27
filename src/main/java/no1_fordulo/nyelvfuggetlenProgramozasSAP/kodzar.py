#!/usr/bin/env python3

def tryToInt(s:str):
  try:
    return int(s)
  except ValueError:
    return s

def solveFile(fn:str, fOut):
  gates = {} # név -> inputok
  gateOrder = [] # előfordulási sorrend a fájlban
  with open(fn) as f:
    n = int(f.readline().strip())
    assert n >= 1
    for line in f:
      line = line.strip()
      if not line:
        continue
      gateName, input1, input2 = line.split()
      assert gateName not in gates
      gates[gateName] = tryToInt(input1), tryToInt(input2)
      gateOrder.append(gateName)
 
  result = "NINCS"
  # One-hot vektorok felsorolása "növekvő" sorrendben
  # (csak 1 db bit 1-es, az, amelyik balról az iHotInput-adik helyen van, 0-tól számozva a biteket)
  for iHotInput in range(n-1, -1, -1):
    gateOutputs = {}
    
    for iBit in range(n):
      gateOutputs[iBit] = (iBit == iHotInput)
      
    for gateName in gateOrder:
      input1, input2 = gates[gateName]
      input1 = gateOutputs[input1]
      input2 = gateOutputs[input2]
      assert input1 in (0, 1)
      assert input2 in (0, 1)
      gateOutputs[gateName] = input1 != input2
    
    if gateOutputs[gateOrder[-1]] == 1:
      result = "0" * iHotInput + "1" + "0" * (n-1 - iHotInput)
      assert len(result) == n
      break
 
  message = "Output for %s: %s" % (fn, result)
  print(message)
  fOut.write(message+"\n")

  if "pelda" in fn:
    fnPeldaOut = fn.replace(".in.", ".out.")
    assert fnPeldaOut != fn
    with open(fnPeldaOut, "w") as fPeldaOut:
      fPeldaOut.write(str(result))

def main():
  with open("out.txt", "w") as fOut:
    for i in range(1, 6):
      solveFile("kodzar%s.in.txt" % (i,), fOut)
    for i in range(1, 3):
      solveFile("kodzar.pelda%s.in.txt" % (i,), fOut)

if __name__ == "__main__":
  main()

