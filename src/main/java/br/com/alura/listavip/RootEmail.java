package br.com.alura.listavip;

import java.util.HashMap;

public class RootEmail {
  private static HashMap<String, String> root_mail = new HashMap<String, String>();

  public RootEmail() {
    root_mail.put("usuario", "XXXX.test.mail@gmail.com");
    root_mail.put("senha", "W@XXX");
  }

  public static HashMap<String, String> getRoot_mail() {
    return root_mail;
  }

}
