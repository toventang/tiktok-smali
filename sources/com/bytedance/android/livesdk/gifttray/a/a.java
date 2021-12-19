package com.bytedance.android.livesdk.gifttray.a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    public boolean A;
    public int B;
    public final y C;

    /* renamed from: a  reason: collision with root package name */
    public String f17994a;

    /* renamed from: b  reason: collision with root package name */
    public int f17995b;

    /* renamed from: c  reason: collision with root package name */
    public EnumC0374a f17996c;

    /* renamed from: d  reason: collision with root package name */
    public int f17997d;

    /* renamed from: e  reason: collision with root package name */
    public int f17998e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17999f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18000g;

    /* renamed from: h  reason: collision with root package name */
    public int f18001h;

    /* renamed from: i  reason: collision with root package name */
    public int f18002i;

    /* renamed from: j  reason: collision with root package name */
    public int f18003j;

    /* renamed from: k  reason: collision with root package name */
    public int f18004k;

    /* renamed from: l  reason: collision with root package name */
    public String f18005l;

    /* renamed from: m  reason: collision with root package name */
    public long f18006m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public CharSequence v;
    public ImageModel w;
    public CharSequence x;
    public long y;
    public User z;

    /* renamed from: com.bytedance.android.livesdk.gifttray.a.a$a  reason: collision with other inner class name */
    public enum EnumC0374a {
        NONE,
        VIDEO_ONLY,
        TRAY_ONLY;

        static {
            Covode.recordClassIndex(9996);
        }
    }

    static {
        Covode.recordClassIndex(9995);
    }

    private /* synthetic */ a() {
        this(null);
    }

    public final int a() {
        return this.f17997d - this.f17998e;
    }

    public final void b() {
        this.f17998e++;
    }

    public final void c() {
        this.f17998e = this.f17997d;
    }

    public final void a(EnumC0374a aVar) {
        l.d(aVar, "");
        this.f17996c = aVar;
    }

    public final void b(String str) {
        l.d(str, "");
        this.f18005l = str;
    }

    public final void a(CharSequence charSequence) {
        l.d(charSequence, "");
        this.x = charSequence;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f17994a = str;
    }

    public a(y yVar) {
        int i2;
        int i3;
        ImageModel imageModel;
        long j2;
        u uVar;
        u uVar2;
        this.C = yVar;
        this.f17994a = "";
        this.f17996c = EnumC0374a.NONE;
        int i4 = 0;
        if (yVar != null) {
            i2 = yVar.n;
        } else {
            i2 = 0;
        }
        this.f17997d = i2;
        if (yVar != null) {
            i3 = yVar.n;
        } else {
            i3 = 0;
        }
        this.f17998e = i3;
        this.f18001h = 1;
        this.f18005l = "0";
        this.v = "";
        User user = null;
        if (yVar == null || (uVar2 = yVar.t) == null) {
            imageModel = null;
        } else {
            imageModel = uVar2.f19759b;
        }
        this.w = imageModel;
        this.x = "";
        if (yVar != null) {
            j2 = yVar.f19707i;
        } else {
            j2 = 0;
        }
        this.y = j2;
        this.z = yVar != null ? yVar.f19705g : user;
        if (!(yVar == null || (uVar = yVar.t) == null)) {
            i4 = uVar.f19763f;
        }
        this.B = i4;
    }
}
