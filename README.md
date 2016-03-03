# Passphrase Generator 1.0

Generates a passphrase from a word list.
Two word list are included:

[Diceware](http://world.std.com/~reinhold/diceware.wordlist.asc) and [Beale](http://world.std.com/~reinhold/beale.wordlist.asc).

[Diceware](http://world.std.com/~reinhold/diceware.wordlist.asc) contains 7776 short words, abbreviations and easy-to-remember character strings.

[Beale](http://world.std.com/~reinhold/beale.wordlist.asc) contains fewer Americanisms and obscure words.

## Requirements
Need Java 1.7 or higher installed

## Run and Configurations
1. Open Cmd or Terminal
2. Change directory to .jar location.
3. java -jar passphraseGenerator.jar

Possible configurations:
java -jar passphraseGenerator.jar {AmountOfWords, Default 5} {WordList, Default beale}

Example:
java -jar passphraseGenerator.jar 7 diceware

Amount of words can be from :  1 to infinity
Word List can be : diceware or beale


## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request

## Issues
* Create Issus
* Give best possible description

## Change Log

### Version 1.0
Initial Release

## Credits

* [Diceware](http://world.std.com/~reinhold/diceware.html)
* [Diceware word list](http://world.std.com/~reinhold/diceware.wordlist.asc)
* [Beale word list](http://world.std.com/~reinhold/beale.wordlist.asc)


## License

[MIT](https://raw.githubusercontent.com/mathiasfrohlich/java-PassphraseGenerator/master/LICENSE)
