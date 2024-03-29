package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;

public class Launch {
	private static User[] users;
	private static Bookmark[][] bookmarks;
	
	private static void loadData() {
		System.out.println("1. Loading data ...");
		DataStore.loadData();
		
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		System.out.println("Printing data ...");
		printUserdata();
		printBookmarkData();
	}
	
	private static void printBookmarkData() {
		for (Bookmark[]  bookmarkList : bookmarks) {
			for(Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
	}

	private static void printUserdata() {
		for (User user : users) {
			System.out.println(user);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadData();
		startBookmarking();
	}

	private static void startBookmarking() {
		System.out.println("2. Bookmarking ...");
	}


	
}
