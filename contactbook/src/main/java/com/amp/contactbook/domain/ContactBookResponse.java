package com.amp.contactbook.domain;

import javax.validation.Valid;

import com.amp.domain.metadata.SearchOutputMetaData;

public class ContactBookResponse {
	
	@Valid
	private SearchOutputMetaData searchOutputMetaData;
	private ContactBook contactBook;
	
	public SearchOutputMetaData getSearchOutputMetaData() {
		return searchOutputMetaData;
	}
	public void setSearchOutputMetaData(SearchOutputMetaData searchOutputMetaData) {
		this.searchOutputMetaData = searchOutputMetaData;
	}
	public ContactBook getContactBook() {
		return contactBook;
	}
	public void setContactBook(ContactBook contactBook) {
		this.contactBook = contactBook;
	}
	
}
