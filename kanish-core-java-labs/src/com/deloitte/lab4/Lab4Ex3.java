package com.deloitte.lab4;

abstract class Item {
	private int id;
	private String title;
	private int numberOfCopies;

	public Item(int id, String title, int numberOfCopies) {
		this.id = id;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public void checkIn() {
		numberOfCopies++;
	}

	public void checkOut() {
		if (numberOfCopies > 0) {
			numberOfCopies--;
		} else {
			System.out.println("No copies available.");
		}
	}

	public void addItem(int n) {
		numberOfCopies += n;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Item) {
			Item other = (Item) obj;
			return this.id == other.id;
		}
		return false;
	}

	public void print() {
		System.out.println("ID: " + id + ", Title: " + title + ", Copies: " + numberOfCopies);
	}
}

abstract class WrittenItem extends Item {
	private String author;

	public WrittenItem(int id, String title, int numberOfCopies, String author) {
		super(id, title, numberOfCopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Author: " + author);
	}
}

class Book extends WrittenItem {
	public Book(int id, String title, int numberOfCopies, String author) {
		super(id, title, numberOfCopies, author);
	}

	@Override
	public void print() {
		System.out.print("Book: ");
		super.print();
	}
}

class JournalPaper extends WrittenItem {
	private int yearPublished;

	public JournalPaper(int id, String title, int numberOfCopies, String author, int yearPublished) {
		super(id, title, numberOfCopies, author);
		this.yearPublished = yearPublished;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	@Override
	public void print() {
		System.out.print("Journal Paper: ");
		super.print();
		System.out.println("Year Published: " + yearPublished);
	}
}

abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem(int id, String title, int numberOfCopies, int runtime) {
		super(id, title, numberOfCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public void print() {
		super.print();
	}
}

class Video extends MediaItem {
	private String director;
	private String genre;
	private int yearReleased;

	public Video(int id, String title, int numberOfCopies, int runtime, String director, String genre,
			int yearReleased) {
		super(id, title, numberOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}

	@Override
	public void print() {
		System.out.print("Video: ");
		super.print();
		System.out.println("Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased);
	}
}

class CD extends MediaItem {
	private String artist;
	private String genre;

	public CD(int id, String title, int numberOfCopies, int runtime, String artist, String genre) {
		super(id, title, numberOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}

	@Override
	public void print() {
		System.out.print("CD: ");
		super.print();
		System.out.println("Artist: " + artist + ", Genre: " + genre);
	}
}

public class Lab4Ex3 {

	public static void main(String[] args) {
		Book book = new Book(1, "The Java Programming Language", 3, "James Gosling");
		book.print();
		book.checkOut();
		book.print();

		JournalPaper journalPaper = new JournalPaper(2, "Advances in Java", 5, "Brian Goetz", 2020);
		journalPaper.print();
		journalPaper.checkOut();
		journalPaper.print();

		Video video = new Video(3, "The Matrix", 2, 120, "Wachowskis", "Sci-Fi", 1999);
		video.print();
		video.checkIn();
		video.print();

		CD cd = new CD(4, "Thriller", 10, 42, "Michael Jackson", "Pop");
		cd.print();
		cd.checkOut();
		cd.print();
	}

}
