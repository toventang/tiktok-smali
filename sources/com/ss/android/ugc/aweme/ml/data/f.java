package com.ss.android.ugc.aweme.ml.data;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.ml.data.g;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class f extends a {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f110477h = com.ss.android.ugc.aweme.ml.a.a.f110297a;

    /* renamed from: i  reason: collision with root package name */
    public static final a f110478i = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public ConcurrentHashMap<String, com.ss.android.ugc.aweme.ml.b.b> f110479c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<String> f110480d;

    /* renamed from: e  reason: collision with root package name */
    public ReentrantReadWriteLock f110481e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f110482f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f110483g;

    public static final class a {
        static {
            Covode.recordClassIndex(70926);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static f f110484a = new f((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f110485b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70927);
        }
    }

    static {
        Covode.recordClassIndex(70925);
    }

    private f() {
        this.f110479c = new ConcurrentHashMap<>();
        this.f110480d = new ArrayList<>();
        this.f110481e = new ReentrantReadWriteLock();
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f110486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f110487b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f110488c;

        static {
            Covode.recordClassIndex(70928);
        }

        c(f fVar, String str, Aweme aweme) {
            this.f110486a = fVar;
            this.f110487b = str;
            this.f110488c = aweme;
        }

        /* JADX INFO: finally extract failed */
        public final void run() {
            User author;
            if (f.f110477h) {
                System.currentTimeMillis();
            }
            this.f110486a.f110481e.writeLock().lock();
            try {
                int i2 = 1;
                if (!this.f110486a.f110480d.contains(this.f110487b)) {
                    this.f110486a.f110480d.add(this.f110487b);
                    g.b.f110500a.f110489c++;
                }
                if (this.f110486a.f110480d.size() > 48) {
                    String str = this.f110486a.f110480d.get(0);
                    l.b(str, "");
                    this.f110486a.f110479c.remove(str);
                    this.f110486a.f110480d.remove(0);
                }
                this.f110486a.f110481e.writeLock().unlock();
                if (this.f110488c != null && (this.f110486a.f110482f || this.f110486a.f110483g)) {
                    com.ss.android.ugc.aweme.ml.b.b a2 = this.f110486a.a(this.f110487b);
                    if (this.f110486a.f110483g && a2 != null) {
                        a2.u = System.currentTimeMillis();
                    }
                    if (this.f110486a.f110482f && a2 != null) {
                        a2.n = this.f110488c.isAd() ? 1 : 0;
                        a2.o = this.f110488c.isMixAweme() ? 1 : 0;
                        User author2 = this.f110488c.getAuthor();
                        if (author2 == null || author2.getFollowStatus() != 1) {
                            i2 = 0;
                        }
                        a2.p = i2;
                        if (this.f110488c.getVideo() != null) {
                            Video video = this.f110488c.getVideo();
                            l.b(video, "");
                            a2.q = video.getDuration();
                        }
                        if (this.f110488c.getStatistics() != null) {
                            AwemeStatistics statistics = this.f110488c.getStatistics();
                            l.b(statistics, "");
                            a2.s = (int) statistics.getDiggCount();
                            AwemeStatistics statistics2 = this.f110488c.getStatistics();
                            l.b(statistics2, "");
                            a2.r = (int) statistics2.getCommentCount();
                            AwemeStatistics statistics3 = this.f110488c.getStatistics();
                            l.b(statistics3, "");
                            a2.t = (int) statistics3.getShareCount();
                        }
                    }
                }
                if (f.f110477h) {
                    System.currentTimeMillis();
                    Aweme aweme = this.f110488c;
                    if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
                        author.getNickname();
                    }
                    this.f110486a.f110480d.size();
                }
            } catch (Throwable th) {
                this.f110486a.f110481e.writeLock().unlock();
                throw th;
            }
        }
    }

    public /* synthetic */ f(byte b2) {
        this();
    }

    public final com.ss.android.ugc.aweme.ml.b.b a(String str) {
        if (str != null && str.length() > 0 && !this.f110479c.containsKey(str)) {
            this.f110479c.putIfAbsent(str, new com.ss.android.ugc.aweme.ml.b.b(str));
        }
        return this.f110479c.get(str);
    }

    public final List<com.ss.android.ugc.aweme.ml.b.b> a(String str, int i2, boolean z) {
        String str2;
        this.f110481e.readLock().lock();
        try {
            int size = this.f110480d.size();
            int i3 = size - 1;
            if (!TextUtils.isEmpty(str) && n.a((Iterable) this.f110480d, (Object) str)) {
                i3 = n.a((List) this.f110480d, (Object) str);
                if (z) {
                    i3--;
                }
            }
            if (i3 < 0 || i3 >= size) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                com.ss.android.ugc.aweme.ml.b.b bVar = (i3 < 0 || (str2 = this.f110480d.get(i3)) == null) ? null : this.f110479c.get(str2);
                i3--;
                arrayList.add(bVar);
            }
            this.f110481e.readLock().unlock();
            return arrayList;
        } finally {
            this.f110481e.readLock().unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6 A[Catch:{ all -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02f8 A[Catch:{ all -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0328 A[Catch:{ all -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x034a A[Catch:{ all -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0351 A[Catch:{ all -> 0x0441 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0353 A[Catch:{ all -> 0x0441 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.util.Map<java.lang.String, java.lang.Object> r53, com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig r54, com.ss.android.ugc.aweme.ml.infra.h r55) {
        /*
        // Method dump skipped, instructions count: 1093
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.data.f.a(java.util.Map, com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig, com.ss.android.ugc.aweme.ml.infra.h):boolean");
    }
}
