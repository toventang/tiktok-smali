package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public class h extends b {
    @c(a = "notify_group")

    /* renamed from: a  reason: collision with root package name */
    public int f112680a;
    @c(a = "count")

    /* renamed from: b  reason: collision with root package name */
    public int f112681b;
    @c(a = "msg_id")

    /* renamed from: c  reason: collision with root package name */
    public String f112682c;
    @c(a = "content")

    /* renamed from: d  reason: collision with root package name */
    public StrangerNoticeMessage f112683d;
    @c(a = StringSet.type)

    /* renamed from: e  reason: collision with root package name */
    public int f112684e;
    @c(a = "author_id")

    /* renamed from: f  reason: collision with root package name */
    public long f112685f;
    @c(a = "item_id")

    /* renamed from: g  reason: collision with root package name */
    public long f112686g;
    @c(a = "push_type")

    /* renamed from: h  reason: collision with root package name */
    public String f112687h;

    static {
        Covode.recordClassIndex(72423);
    }

    public h() {
        this.msgType = f.NOTICE;
    }
}
