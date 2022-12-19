package org.example.chat.abstracts;

public abstract class User {
  protected ChatMediator chatMediator;
  protected String name;

  public User(ChatMediator mediator, String name) {
    this.chatMediator = mediator;
    this.name = name;
  }

  public abstract void send(String msg);
  public abstract void receive(String msg);
}
