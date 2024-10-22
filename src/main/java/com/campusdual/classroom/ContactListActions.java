package com.campusdual.classroom;

import java.util.Map;

public interface ContactListActions {
    void addContact(Contact contact);
    void deleteContact(String contactCode);
    void showPhonebook();
    Map<String, Contact> getData();
}
