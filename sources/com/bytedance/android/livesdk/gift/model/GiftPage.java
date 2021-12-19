package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.livesdk.model.GiftOperation;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.model.w;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class GiftPage {
    @c(a = "display")
    public boolean display;
    @c(a = "event_name")
    public String eventName;
    @c(a = "gifts")
    public List<u> gifts;
    @c(a = "page_operation")
    public GiftOperation operation;
    @c(a = "page_name")
    public String pageName;
    @c(a = "page_instruction")
    public w pagePanelBanner;
    @c(a = "page_type")
    public int pageType;

    static {
        Covode.recordClassIndex(9929);
    }
}
