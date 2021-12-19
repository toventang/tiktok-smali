package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class QueryCorrectInfo implements Serializable {
    static final long serialVersionUID = 1;
    @c(a = "correct_highlight_position")
    CorrectHighlightPositions correctHighlightPositions;
    @c(a = "corrected_query")
    String correctedKeyword;
    @c(a = "correct_level")
    int correctedLevel;
    private String requestId;

    static {
        Covode.recordClassIndex(50919);
    }

    public CorrectHighlightPositions getCorrectHighlightPosition() {
        return this.correctHighlightPositions;
    }

    public String getCorrectedKeyword() {
        return this.correctedKeyword;
    }

    public int getCorrectedLevel() {
        return this.correctedLevel;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean isCorrectHighArrayAvailable() {
        CorrectHighlightPositions correctHighlightPositions2 = this.correctHighlightPositions;
        if (correctHighlightPositions2 == null || !correctHighlightPositions2.hasHighlightPosition()) {
            return false;
        }
        return true;
    }

    public void setCorrectHighlightPosition(CorrectHighlightPositions correctHighlightPositions2) {
        this.correctHighlightPositions = correctHighlightPositions2;
    }

    public void setCorrectedKeyword(String str) {
        this.correctedKeyword = str;
    }

    public void setCorrectedLevel(int i2) {
        this.correctedLevel = i2;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
