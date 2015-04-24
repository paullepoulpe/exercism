package leap

const testVersion = 1

func isDivisibleBy(n int, k int) bool { return n%k == 0 }

func isSimpleLeap(year int) bool { return isDivisibleBy(year, 4) }

func isCentury(year int) bool { return isDivisibleBy(year, 100) }

func isFourthCentury(year int) bool { return isDivisibleBy(year, 400) }

// IsLeapYear reports whether year is leap or not
func IsLeapYear(year int) bool {
	return (isSimpleLeap(year) && !isCentury(year)) || isFourthCentury(year)
}
