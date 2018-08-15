function getText() {
    let result = '';
    for (let i = 0; i < 50; i++) {
        result += 'Hello, World! ';
    }
    return result;
}

console.log(getText());
setTimeout(function () {
    console.log('\nAfter 1 sec delay:');
    console.log(getText());
}, 1000);