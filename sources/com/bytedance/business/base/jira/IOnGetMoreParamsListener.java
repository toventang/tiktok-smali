package com.bytedance.business.base.jira;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface IOnGetMoreParamsListener {
    static {
        Covode.recordClassIndex(15733);
    }

    List<FileParam> getMoreJIRAParams();
}
