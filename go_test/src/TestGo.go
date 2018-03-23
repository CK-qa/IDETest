package main

import "fmt"

func main() {
	fmt.Println("hello world")
	other()
	for_cycle()
}

func other() {
	var a = "initial"
	fmt.Println(a)
	//You can declare multiple variables at once.

	var b, c = 1, 2
	fmt.Println(b, c)
	//Go will infer the type of initialized variables.

	var _ = true
	fmt.Println(true)
	//Variables declared without a corresponding initialization are zero-valued. For example, the zero value for an int is 0.

	var e int
	fmt.Println(e)
	//The := syntax is shorthand for declaring and initializing a variable, e.g. for var f string = "short" in this case.

	f := "short"
	fmt.Println(f)
}

func for_cycle() {
	i := 1
	for i <= 3 {
		fmt.Println(i)
		i = i + 1
	}

	for j := 7; j <= 9; j++ {
		fmt.Println(j)
	}

	for {
		fmt.Println("loop")
		break
	}

	for n := 1; n <= 5; n++ {
		if n%2 == 0 {
			continue
		}
		fmt.Println(n)
	}

}
