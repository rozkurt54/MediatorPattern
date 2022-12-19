package org.example.chat.concretes;

import org.example.chat.abstracts.ChatMediator;
import org.example.chat.abstracts.User;

public class UserImpl extends User {

  public UserImpl(ChatMediator mediator, String name) {
    super(mediator, name);
  }

  @Override
  public void send(String msg) {
      chatMediator.sendMessage(msg, this);
  }


  @Override
  public void receive(String msg) {

    System.out.println(this.name + " says: +" +msg );

  }
}
