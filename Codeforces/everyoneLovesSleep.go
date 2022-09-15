package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	in := bufio.NewReader(os.Stdin)
	var t, N, H, M, D, m, min, anc int

	fmt.Fscan(in, &t)
	for i := 0; i < t; i++ {
		fmt.Fscan(in, &N, &H, &M)
		val := H*60 + M
		min = 10000
		for j := 0; j < N; j++ {
			fmt.Fscan(in, &D, &m)
			tm := 60*D + m
			if val > tm {
				tm += 1440
			}
			anc = tm - val
			if min > anc {
				min = anc
			}
		}
		fmt.Println(min/60, min%60)
	}
}
