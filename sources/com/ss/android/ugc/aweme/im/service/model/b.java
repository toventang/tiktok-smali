package com.ss.android.ugc.aweme.im.service.model;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.z;

public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final a f103884i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public User f103885a;

    /* renamed from: b  reason: collision with root package name */
    public View f103886b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f103887c;

    /* renamed from: d  reason: collision with root package name */
    public int f103888d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Object f103889e;

    /* renamed from: f  reason: collision with root package name */
    public String f103890f = "";

    /* renamed from: g  reason: collision with root package name */
    public final String f103891g = "follow_button";

    /* renamed from: h  reason: collision with root package name */
    public final Activity f103892h;

    static {
        Covode.recordClassIndex(66561);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f103892h, ((b) obj).f103892h);
        }
        return true;
    }

    public final int hashCode() {
        Activity activity = this.f103892h;
        if (activity != null) {
            return activity.hashCode();
        }
        return 0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66562);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String toString() {
        String str;
        Integer num;
        StringBuilder append = new StringBuilder("FollowWrap{").append(this.f103892h).append(", ");
        User user = this.f103885a;
        Integer num2 = null;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        StringBuilder append2 = append.append(str).append(", ");
        User user2 = this.f103885a;
        if (user2 != null) {
            num = Integer.valueOf(user2.getFollowStatus());
        } else {
            num = null;
        }
        StringBuilder append3 = append2.append(num).append(", ");
        User user3 = this.f103885a;
        if (user3 != null) {
            num2 = Integer.valueOf(user3.getFollowerStatus());
        }
        return append3.append(num2).append('}').toString();
    }

    public final void a() {
        com.ss.android.ugc.aweme.im.service.j.a familiarService = IMService.createIIMServicebyMonsterPlugin(false).getFamiliarService();
        if (familiarService != null) {
            familiarService.a(this);
        }
    }

    public final b a(int i2) {
        this.f103888d = i2;
        return this;
    }

    public static final b a(Activity activity) {
        return new b(activity);
    }

    public final b a(View view) {
        this.f103886b = view;
        return this;
    }

    private b(Activity activity) {
        this.f103892h = activity;
    }

    public final b a(TextView textView) {
        this.f103887c = textView;
        return this;
    }

    public final b a(User user) {
        this.f103885a = user;
        return this;
    }

    public final b a(Object obj) {
        this.f103889e = obj;
        return this;
    }

    public final b a(String str) {
        if (str == null) {
            str = "";
        }
        this.f103890f = str;
        return this;
    }

    public final void a(h.f.a.b<? super c, z> bVar) {
        c cVar;
        l.d(bVar, "");
        com.ss.android.ugc.aweme.im.service.j.a familiarService = IMService.createIIMServicebyMonsterPlugin(false).getFamiliarService();
        if (familiarService != null) {
            cVar = familiarService.b(this);
        } else {
            cVar = null;
        }
        bVar.invoke(cVar);
    }
}
