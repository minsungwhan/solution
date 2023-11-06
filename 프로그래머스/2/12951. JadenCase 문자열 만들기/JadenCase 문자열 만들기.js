function solution(s) {
    var answer = '';
			answer += s.split(' ').map(function(word) {
				return ' ' + word.charAt(0).toUpperCase() + word.toLowerCase().slice(1);
			}).join('');
	return(answer.slice(1));
}