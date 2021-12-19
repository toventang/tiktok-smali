package com.ss.android.ugc.aweme.friends.widget.contact.vm;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.a.ag;
import h.v;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.cu;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.z;

public abstract class ContactVM extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Integer> f97347a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public final am f97348b;

    /* renamed from: c  reason: collision with root package name */
    private final z f97349c;

    static {
        Covode.recordClassIndex(61845);
    }

    public abstract int a(com.ss.android.ugc.aweme.friends.widget.contact.a aVar);

    public abstract String a();

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        this.f97349c.a((CancellationException) null);
    }

    public ContactVM() {
        z a2 = cu.a();
        this.f97349c = a2;
        this.f97348b = an.a(o.f159148a.plus(a2));
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContactVM f97350a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f97351b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f97352c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f97353d;

        static {
            Covode.recordClassIndex(61846);
        }

        public a(ContactVM contactVM, String str, String str2, String str3) {
            this.f97350a = contactVM;
            this.f97351b = str;
            this.f97352c = str2;
            this.f97353d = str3;
        }

        public final void run() {
            r.a("invite_friend_click", ag.a(v.a("enter_from", "notification_page"), v.a("has_photo", this.f97351b), v.a("rank", this.f97352c), v.a("enter_method", this.f97350a.a()), v.a("url", this.f97353d)));
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContactVM f97354a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f97355b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f97356c;

        static {
            Covode.recordClassIndex(61847);
        }

        public b(ContactVM contactVM, String str, int i2) {
            this.f97354a = contactVM;
            this.f97355b = str;
            this.f97356c = i2;
        }

        public final void run() {
            r.a("contact_invite_show", ag.a(v.a("enter_from", "notification_page"), v.a("has_photo", this.f97355b), v.a("rank", String.valueOf(this.f97356c)), v.a("enter_method", this.f97354a.a())));
        }
    }
}
