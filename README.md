# Shopping Receipt
### Simple shopping receipt program in Java8 using Zulu 1.8 and JUnit for testing.
## Objective
Write a program to print receipt for a shopping cart including sales tax.

Customers shop from different states of US, and sales tax is applied based on location and product category.

Sales tax = roundup(price * quantity * sales tax rate)

Certain product categories are exempt from sales tax (means tax will be 0), and sales tax amount should be rounded up to the nearest 0.05 (e.g. 1.13->1.15, 1.16->1.20, 1.151->1.20)

The interactive UI is not required, at minimum you can implement code method and use parameters as input. or read input value from file.
## Input
The input of the program includes: product name, price, quantity and location of the purchase.

All other information, such as tax rates and product categories, is not part of the input and can be stored/ initialized within the program or as part of configuration settings.

## Output
The program should print the list of items customer purchased, including name/qty/price, subtotal, sales tax, and total, by following format of use cases.

## Tax rates
In California (CA), sales tax rate is 9.75%, food is exempt.

In New York (NY), sales tax rate is 8.875%, food and clothing are exempt.

## Use Case
1.

| Item          | Price  | Quantity | Total    |
|---------------|--------|----------|----------|
| Book          | $17.99 | 1        | $17.99   |
| Potato Chips  | $3.99  | 1        | $3.99    |
| **Subtotal**  |        |          | $21.98   |
| **Tax**       |        |          | $1.80    |
| **Total**     |        |          | $23.78   |

2.

| Item          | Price  | Quantity | Total    |
|---------------|--------|----------|----------|
| Book          | $17.99 | 1        | $17.99   |
| Pencil        | $2.99  | 3        | $8.97    |
| **Subtotal**  |        |          | $26.96   |
| **Tax**       |        |          | $2.40    |
| **Total**     |        |          | $29.36   |

3.

| Item          | Price  | Quantity | Total    |
|---------------|--------|----------|----------|
| Pencil        | $2.99  | 2        | $5.98    |
| Shirt         | $29.99 | 1        | $29.99   |
| **Subtotal**  |        |          | $35.97   |
| **Tax**       |        |          | $0.55    |
| **Total**     |        |          | $36.52   |
