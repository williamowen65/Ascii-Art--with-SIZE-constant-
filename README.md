# Ascii Art Book

[Link to problem in Code Step By Step](https://www.codestepbystep.com/r/problem/view/java/loops/Book2)

### Pseudocode

- draw top edge of book
  - some amount of spaces
  - a plus
  - some amount of dashes
  - a plus
- Draw face of top of book
  - some spaces
  - a slash
  - some spaces
  - Series of dashes (underscores?) and slash
  - some amount of slashes.
- draw book edge
  - plus, dashes, plus
  - some number of slashes
- Draw beam of book
  - |
  - some spaces
  - "How to Code in Java"
  - some spaces
  - |
  - some slashes
- draw book edge
  - plus, dashes, plus

## Output Size 10

Top section spaces

| i   | # outer spaces | # inner spaces | # of \_\_\_/ | # of extra / |
| --- | -------------- | -------------- | ------------ | ------------ |
| 0   | 11             | 27             | 1            | 0            |
| 1   | 10             | 24             | 2            | 1            |
| 2   | 9              | 21             | 3            | 2            |
| 3   | 8              | 18             | 4            | 3            |

Bottom section

| i   | # spaces | # slashes |
| --- | -------- | --------- |
| 0   | 5        | 10        |
| 1   | 5        | 8         |
| 2   | 5        | 6         |

Equations (top)

| # outer spaces | # inner spaces | # of \_\_\_/ | # of extra / |
| -------------- | -------------- | ------------ | ------------ |
| 11 - 1 \* i    | 27 - 3 \* i    | 1 + 1 \* i   | 1 \* i       |

Equations (bottom)

| # spaces | # slashes   |
| -------- | ----------- |
| 5        | 10 - 2 \* i |

Other details

> total beam length = 30 characters  
> \# of "how to" = 5  
> "Now only $50

## Output Size 14

Top section spaces

| i   | # outer spaces | # inner spaces | # of \_\_\_/ | # of extra / |
| --- | -------------- | -------------- | ------------ | ------------ |
| 0   | 15             | 39             | 1            | 0            |
| 1   | 14             | 36             | 2            | 1            |
| 2   | 13             | 33             | 3            | 2            |
| 3   | 12             | 30             | 4            | 3            |

Bottom section

| i   | # spaces | # slashes |
| --- | -------- | --------- |
| 0   | 11       | 14        |
| 1   | 11       | 12        |
| 2   | 11       | 10        |

Equations (top)

| # outer spaces | # inner spaces | # of \_\_\_/ | # of extra / |
| -------------- | -------------- | ------------ | ------------ |
| 15 - 1 \* i    | 39 - 3 \* i    | 1 + 1 \* i   | 1 \* i       |

Equations (bottom)

| # spaces | # slashes   |
| -------- | ----------- |
| 11       | 14 - 2 \* i |

Other details

> total beam length = 42 characters  
> \# of "how to" = 7
> "Now only $70

---

## The Conversion between SIZE 10 and 14

> I initially programmed the book with SIZE 10 in mind, thinking I'll plug in the SIZE afterwards  
> It has something to do with calculating the slope and "fudge" factor
>
> Compare the sets of equations. Identify the differences...

Equations (top)

| SIZE | # outer spaces | # inner spaces | # of \_\_\_/ | # of extra / |
| ---- | -------------- | -------------- | ------------ | ------------ |
| 10   | 11 - 1 \* i    | 27 - 3 \* i    | 1 + 1 \* i   | 1 \* i       |
| 14   | 15 - 1 \* i    | 39 - 3 \* i    | 1 + 1 \* i   | 1 \* i       |

Equations (bottom)

| SIZE | # spaces | # slashes   | edge Length |
| ---- | -------- | ----------- | ----------- |
| 10   | 5        | 10 - 2 \* i | 32          |
| 14   | 11       | 14 - 2 \* i | 44          |

> ### SLOPE
>
> #### Outer spaces
>
> (15 - 11)/(14 - 10) = 4/4 = 1  
> SIZE \* 1  
> 10 \* 1 = 10 (off by 1....)  
> 10\* 1 + 1
> ..... SIZE + 1
>
> #### inner spaces
>
> (39 - 27)/(14 - 10) = 12/4 = 3  
> SIZE \* 3
> 10 \* 3 = 30 (off by 3)  
> 10 \* 3 - 3 = 27  
> SIZE \* 3 - 3
>
> #### Edge length
>
> (42 - 30)/(14 - 10)= 12/ 4 = 3  
> SIZE \* 3 (off by 2???)
>
> #### bottom spaces
>
> (11 - 5)/(14 - 10) = 6/4 = 1.5  
> 10 \* 1.5 = 15 (way off by 10)
>
> #### num slashes
>
> (14 - 10)/(14 - 10) = 4/4 = 1  
> SIZE \* 1
>
> #### book height
>
> (7 - 5)/(14 - 10) = 2/4 = .5
>
> SIZE \* .5
> 10 \* .5 = 5
>
> #### Cost of book
>
> (70 - 50)/(14 - 10) = 20/4 = 5
> size \* 5
> 10 \* 5 = 50
> 14 \* 5 =

Corrected equations

| # outer spaces | # inner spaces | # of \_\_\_/ | # of extra / | edge length |
| -------------- | -------------- | ------------ | ------------ | ----------- |
| SIZE + 1       | SIZE \* 3 - 3  | 1 + 1 \* i   | 1 \* i       | SIZE \* 3   |

| # spaces        | # slashes     | Book Height |
| --------------- | ------------- | ----------- |
| SIZE \* 1.5 -10 | SIZE - 2 \* i | SIZE \* .5  |
