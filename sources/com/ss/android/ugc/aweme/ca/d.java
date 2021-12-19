package com.ss.android.ugc.aweme.ca;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Message> f69599a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static final d f69600b = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(42935);
    }

    public static void a() {
        for (T t : f69599a) {
            t.getTarget().sendMessageAtFrontOfQueue(t);
        }
        f69599a.clear();
    }
}
