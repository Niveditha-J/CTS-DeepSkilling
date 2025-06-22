package FactoryMethodPatternExample;
// WordFactory.java
public class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}
