package org.example.chat.concretes;

import org.example.chat.abstracts.ChatMediator;
import org.example.chat.abstracts.User;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

  private List<User> userList;

  public ChatMediatorImpl(){
    this.userList = new ArrayList<>();
  }

  @Override
  public void sendMessage(String msg, User user) {
    for (User u : userList) {
      if( u != user) {
        u.receive(msg);
      }
    }


  }

  @Override
  public void addUser(User user) {
    this.userList.add(user);
  }
}
