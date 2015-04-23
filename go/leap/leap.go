package leap

// Source: exercism/x-common
// Commit: 945d08e Merge pull request #50 from soniakeys/master

func IsLeapYear(year int) bool {
	leap := year%4 == 0
	century := year%100 == 0
	fourthCentury := year%400 == 0
	return (leap && !century) || fourthCentury
}
