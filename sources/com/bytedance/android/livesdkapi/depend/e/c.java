package com.bytedance.android.livesdkapi.depend.e;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.report.ReportReason;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class c {
    public final String A;
    public final String B;
    public String C;
    public Map<String, String> D;
    public long E;
    public long F;
    public List<ReportReason> G;
    public Room H;
    public final boolean I;
    public final boolean J;
    public final List<User> K;
    public final List<User> L;
    public final String M;
    public final String N;
    public final boolean O;
    public final AbstractC0503c P;
    public final b Q;

    /* renamed from: a  reason: collision with root package name */
    public String f22965a;

    /* renamed from: b  reason: collision with root package name */
    public long f22966b;

    /* renamed from: c  reason: collision with root package name */
    public long f22967c;

    /* renamed from: d  reason: collision with root package name */
    public long f22968d;

    /* renamed from: e  reason: collision with root package name */
    public String f22969e;

    /* renamed from: f  reason: collision with root package name */
    public String f22970f;

    /* renamed from: g  reason: collision with root package name */
    public ImageModel f22971g;

    /* renamed from: h  reason: collision with root package name */
    public ImageModel f22972h;

    /* renamed from: i  reason: collision with root package name */
    public ImageModel f22973i;

    /* renamed from: j  reason: collision with root package name */
    public ImageModel f22974j;

    /* renamed from: k  reason: collision with root package name */
    public String f22975k;

    /* renamed from: l  reason: collision with root package name */
    public String f22976l;

    /* renamed from: m  reason: collision with root package name */
    public String f22977m;
    public String n;
    public String o;
    public String p;
    public boolean q;
    public boolean r;
    public boolean s;
    public String t;
    public String u;
    public String v;
    public String w;
    public boolean x;
    public List<a> y;
    public final String z;

    public interface b {
        static {
            Covode.recordClassIndex(13620);
        }

        void a();
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.e.c$c  reason: collision with other inner class name */
    public interface AbstractC0503c {
        static {
            Covode.recordClassIndex(13621);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(13618);
    }

    public static a a() {
        return new a((byte) 0);
    }

    public static final class a {
        public Map<String, String> A;
        public String B;
        public boolean C;
        public final List<a> D;
        public String E;
        public String F;
        public String G;
        public boolean H;
        public boolean I;
        public final List<User> J;
        public final List<User> K;
        public String L;
        public String M;
        public String N;
        public boolean O;
        public AbstractC0503c P;
        public b Q;

        /* renamed from: a  reason: collision with root package name */
        public String f22978a;

        /* renamed from: b  reason: collision with root package name */
        public long f22979b;

        /* renamed from: c  reason: collision with root package name */
        public long f22980c;

        /* renamed from: d  reason: collision with root package name */
        public long f22981d;

        /* renamed from: e  reason: collision with root package name */
        public String f22982e;

        /* renamed from: f  reason: collision with root package name */
        public String f22983f;

        /* renamed from: g  reason: collision with root package name */
        public ImageModel f22984g;

        /* renamed from: h  reason: collision with root package name */
        public ImageModel f22985h;

        /* renamed from: i  reason: collision with root package name */
        public ImageModel f22986i;

        /* renamed from: j  reason: collision with root package name */
        public ImageModel f22987j;

        /* renamed from: k  reason: collision with root package name */
        public String f22988k;

        /* renamed from: l  reason: collision with root package name */
        public String f22989l;

        /* renamed from: m  reason: collision with root package name */
        public String f22990m;
        public String n;
        public String o;
        public String p;
        public boolean q;
        public boolean r;
        public boolean s;
        public String t;
        public String u;
        public long v;
        public long w;
        public String x;
        public List<ReportReason> y;
        public Room z;

        static {
            Covode.recordClassIndex(13619);
        }

        public final c a() {
            return new c(this, (byte) 0);
        }

        private a() {
            this.f22989l = "";
            this.f22990m = "";
            this.n = "";
            this.o = "";
            this.p = "";
            this.D = new ArrayList();
            this.J = new ArrayList();
            this.K = new ArrayList();
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final a a(List<a> list) {
            this.D.addAll(list);
            return this;
        }

        private a(User user) {
            this.f22989l = "";
            this.f22990m = "";
            this.n = "";
            this.o = "";
            this.p = "";
            this.D = new ArrayList();
            this.J = new ArrayList();
            this.K = new ArrayList();
            if (user != null) {
                this.f22980c = user.getId();
                this.f22983f = user.getIdStr();
                this.f22984g = user.getAvatarThumb();
                this.f22985h = user.getAvatarMedium();
                this.f22986i = user.getAvatarLarge();
                this.f22988k = user.getNickName();
                this.f22982e = user.displayId;
                this.x = user.getSecUid();
            }
        }

        private a(Room room) {
            this.f22989l = "";
            this.f22990m = "";
            this.n = "";
            this.o = "";
            this.p = "";
            this.D = new ArrayList();
            this.J = new ArrayList();
            this.K = new ArrayList();
            this.f22979b = room.getId();
            this.f22987j = room.getCover();
            this.t = room.getRequestId();
            this.f22989l = room.getShareUrl();
            this.f22990m = room.getTitle();
            this.z = room;
            User owner = room.getOwner();
            if (owner != null) {
                this.f22980c = owner.getId();
                this.f22983f = owner.getIdStr();
                this.f22984g = owner.getAvatarThumb();
                this.f22985h = owner.getAvatarMedium();
                this.f22986i = owner.getAvatarLarge();
                this.f22988k = owner.getNickName();
                this.f22982e = owner.displayId;
                this.x = owner.getSecUid();
            }
        }

        public /* synthetic */ a(User user, byte b2) {
            this(user);
        }

        /* synthetic */ a(Room room, byte b2) {
            this(room);
        }
    }

    public final void b() {
        if (this.n == null) {
            this.n = "";
        }
        if (this.f22977m == null) {
            this.f22977m = "";
        }
        if (this.o == null) {
            this.o = "";
        }
        if (this.f22976l == null) {
            this.f22976l = "";
        }
    }

    public static a a(Room room) {
        return new a(room, (byte) 0);
    }

    private c(a aVar) {
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.L = arrayList2;
        this.f22965a = aVar.f22978a;
        this.f22977m = aVar.f22990m;
        this.n = aVar.n;
        this.o = aVar.o;
        this.f22976l = aVar.f22989l;
        this.p = aVar.p;
        this.f22967c = aVar.f22979b;
        this.f22968d = aVar.f22980c;
        this.f22966b = aVar.f22981d;
        this.f22969e = aVar.f22983f;
        this.f22971g = aVar.f22984g;
        this.f22972h = aVar.f22985h;
        this.f22973i = aVar.f22986i;
        this.f22974j = aVar.f22987j;
        this.f22975k = aVar.f22988k;
        this.q = aVar.q;
        this.r = aVar.r;
        this.s = aVar.s;
        this.t = aVar.t;
        this.u = aVar.u;
        this.G = aVar.y;
        this.H = aVar.z;
        this.D = aVar.A;
        this.f22970f = aVar.f22982e;
        this.v = aVar.B;
        this.E = aVar.v;
        this.F = aVar.w;
        this.w = aVar.x;
        this.x = aVar.C;
        this.y = aVar.D;
        this.z = aVar.E;
        this.A = aVar.F;
        this.B = aVar.G;
        this.I = aVar.H;
        this.J = aVar.I;
        this.O = aVar.O;
        if (!aVar.J.isEmpty()) {
            arrayList.addAll(aVar.J);
        }
        if (!aVar.K.isEmpty()) {
            arrayList2.addAll(aVar.K);
        }
        this.M = aVar.L;
        this.C = aVar.M;
        this.N = aVar.N;
        this.P = aVar.P;
        this.Q = aVar.Q;
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
