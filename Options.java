/*
 * The copyright of this file belongs to Koninklijke Philips N.V., 2019.
 */
package com.philips.chatbot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Options {

  @Id
  @Column(name="oid")
  int optionId;

  @Getter(AccessLevel.NONE)
  @ManyToOne(fetch = FetchType.LAZY)
  @JsonIgnore
  private Questions question;

  int qid;
  @Column(name="opt")
  String option;
  @Column(name="link_id")
  int linkId;
  @Column(name="monitor_id")
  int monitorId;

  public Options() {

  }

  public Options(int optionId, int qid, String option, int linkId, int monitorId) {
    super();
    this.optionId = optionId;
    this.qid = qid;
    this.option = option;
    this.linkId = linkId;
    this.monitorId = monitorId;
  }


  @Override
  public String toString() {
    return "Options [optionId=" + optionId + ", questionId=" + qid + ", option=" + option
        + ", linkId=" + linkId + ", monitorId=" + monitorId + "]";
  }



}
