# Kotlin OOP Task 1 - Gnomes

This task is intended to test and reinforce your understanding of the Object-Oriented Programming (OOP) paradigm, and its use via the Kotlin language.

## Task Notes

### Garden Gnomes

```
    /\
   ('')
 __{__}__   /\
    #1  |  (oo)
        |__{__}__   /\
            #2  |  (xx)
                |__{__}__
                    #3  |
```
Gnomes are placed on some steps in the garden. The top step is #1, the lowest step is #10 
- Only one gnome can be on a step at a time
- Gnomes can be shifted to different steps, but only if they are unoccupied
- Gnomes can be moved up and down the steps, but not above the top step (1), nor below the lowest (10)
- If Gnomes are moving up/down, and the target step is occupied, they take the step before
