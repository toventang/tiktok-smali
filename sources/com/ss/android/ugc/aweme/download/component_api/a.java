package com.ss.android.ugc.aweme.download.component_api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.b.h;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.q;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.downloader.r;
import com.ss.android.socialbase.downloader.downloader.u;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.download.component_api.b.b;
import java.util.List;
import java.util.Map;

public abstract class a {
    protected u A;
    protected y B;
    public IDownloadListener C;
    public IDownloadListener D;
    public IDownloadListener E;
    protected IDownloadDepend F;
    protected boolean G;
    public c H;
    protected String I;
    protected String J;
    public Map<String, String> K;
    protected boolean L;
    protected String M;
    protected b N;
    protected boolean O;
    protected String P;
    public com.ss.android.ugc.aweme.download.component_api.b.a Q;
    protected boolean R;
    protected int S;
    public boolean T;
    public boolean U;
    public com.ss.android.ugc.aweme.download.component_api.a.b V;
    public com.ss.android.ugc.aweme.download.component_api.a.a W;
    protected boolean X;
    protected boolean Y;
    protected boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public Context f83076a;

    /* renamed from: b  reason: collision with root package name */
    public int f83077b;

    /* renamed from: c  reason: collision with root package name */
    public String f83078c;

    /* renamed from: d  reason: collision with root package name */
    public String f83079d;

    /* renamed from: e  reason: collision with root package name */
    public String f83080e;

    /* renamed from: f  reason: collision with root package name */
    public String f83081f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f83082g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f83083h;

    /* renamed from: i  reason: collision with root package name */
    protected String f83084i;

    /* renamed from: j  reason: collision with root package name */
    protected List<HttpHeader> f83085j;

    /* renamed from: k  reason: collision with root package name */
    protected int f83086k;

    /* renamed from: l  reason: collision with root package name */
    protected int f83087l;

    /* renamed from: m  reason: collision with root package name */
    protected int f83088m;
    public List<String> n;
    protected boolean o;
    protected String p;
    protected boolean q;
    public String r;
    public String s;
    protected String t;
    protected boolean u = true;
    protected String v;
    protected long w;
    protected boolean x;
    protected boolean y;
    protected q z;

    static {
        Covode.recordClassIndex(51790);
    }

    public abstract int a(r rVar);

    public abstract int a(c cVar);

    public void a(int i2, AbsDownloadListener absDownloadListener, h hVar) {
    }

    public final a b() {
        this.f83083h = true;
        return this;
    }

    public final a c() {
        this.S = 3;
        return this;
    }

    public final a d() {
        this.X = true;
        return this;
    }

    public final a e() {
        this.G = true;
        return this;
    }

    public abstract int f();

    public final a a() {
        this.Y = true;
        return this;
    }

    public final a b(String str) {
        this.L = true;
        this.M = str;
        this.N = null;
        return this;
    }

    public final a a(int i2) {
        this.f83086k = i2;
        return this;
    }

    public final a a(String str) {
        this.v = str;
        return this;
    }

    public final a a(List<HttpHeader> list) {
        this.f83085j = list;
        return this;
    }

    public final a a(boolean z2) {
        this.Z = z2;
        return this;
    }

    public a(Context context, String str) {
        this.f83076a = context;
        this.f83080e = str;
    }
}
