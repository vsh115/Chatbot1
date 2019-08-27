/*
 * The copyright of this file belongs to Koninklijke Philips N.V., 2019.
 */
package com.philips.chatbot.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Questions {

  @Id
  int qid;

  String question;

  @OneToMany(mappedBy = "question")
  private List<Options> options;

  public Questions() {

  }

  public Questions(int qid, String question) {
    super();
    this.qid = qid;
    this.question = question;
  }

  @Override
  public String toString() {
    return "Questions [questionId=" + qid + ", question=" + question + "]";
  }


}
