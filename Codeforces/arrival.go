package main

import (
	"fmt"
)

func solve() {
	var n int
	fmt.Scan(&n)

	max_val, min_val, maxi, mini := 0, 110, 0, 0

	for i := 1; i <= n; i++ {
		var a int
		fmt.Scan(&a)
		if a > max_val {
			maxi = i
			max_val = a
		}
		if a <= min_val {
			mini = i
			min_val = a
		}
	}

	if maxi > mini {
		fmt.Println((maxi - 1) + (n - mini) - 1)
	} else {
		fmt.Println((maxi - 1) + (n - mini))
	}
}

func main() {
	solve()
}
