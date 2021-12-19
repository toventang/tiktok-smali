package com.bytedance.services.apm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;

public interface IFdCheck extends IService {
    static {
        Covode.recordClassIndex(26952);
    }

    List<String> getFdList();
}
