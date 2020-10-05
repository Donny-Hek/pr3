class Book {
    private String author, name;
    private int year;

    Book(String a, String b, int c) {
        author=a;
        name=b;
        year=c;
    }
    void setAuthor(String a) {author=a;}
    void setName(String b) {name=b;}
    void setYear(int c) {year=c;}

    String getAuthor() {return author;}
    String getName() {return name;}
    int getYear() {return year;}

    @Override
    public String toString() {
        return author + "/" + name + "/" + year;
    }
}
