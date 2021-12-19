package com.ss.android.ugc.aweme.feed.e;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.facebook.j.a.b;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.BuildConfigAllServiceImpl;
import com.ss.android.ugc.aweme.IUgAllService;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.ss.android.ugc.aweme.commercialize.IAdCardService;
import com.ss.android.ugc.aweme.commercialize.feed.bd;
import com.ss.android.ugc.aweme.commercialize.feed.c;
import com.ss.android.ugc.aweme.commercialize.utils.bk;
import com.ss.android.ugc.aweme.commercialize.utils.bm;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.ct.c;
import com.ss.android.ugc.aweme.experiment.ap;
import com.ss.android.ugc.aweme.experiment.bu;
import com.ss.android.ugc.aweme.experiment.cq;
import com.ss.android.ugc.aweme.experiment.de;
import com.ss.android.ugc.aweme.experiment.dl;
import com.ss.android.ugc.aweme.experiment.fg;
import com.ss.android.ugc.aweme.experiment.gg;
import com.ss.android.ugc.aweme.feed.adapter.ah;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import com.ss.android.ugc.aweme.feed.cache.e;
import com.ss.android.ugc.aweme.feed.experiment.ae;
import com.ss.android.ugc.aweme.feed.experiment.ak;
import com.ss.android.ugc.aweme.feed.experiment.am;
import com.ss.android.ugc.aweme.feed.i.v;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.param.MobParamProvider;
import com.ss.android.ugc.aweme.feed.q.al;
import com.ss.android.ugc.aweme.feed.q.ay;
import com.ss.android.ugc.aweme.feed.x.aa;
import com.ss.android.ugc.aweme.feed.x.g;
import com.ss.android.ugc.aweme.feed.x.y;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.metrics.ao;
import com.ss.android.ugc.aweme.metrics.as;
import com.ss.android.ugc.aweme.ml.ab.SmartPreloadExperiment;
import com.ss.android.ugc.aweme.ml.api.IMLCommonService;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedAdUIService;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.player.a.b;
import com.ss.android.ugc.aweme.player.a.d;
import com.ss.android.ugc.aweme.player.a.e;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService;
import com.ss.android.ugc.aweme.preload.b.a;
import com.ss.android.ugc.aweme.profile.model.HotListStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.report.d;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.j.j;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.aweme.utils.dw;
import com.ss.android.ugc.aweme.utils.fp;
import com.ss.android.ugc.aweme.utils.fq;
import com.ss.android.ugc.aweme.utils.fr;
import com.ss.android.ugc.aweme.utils.w;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.aweme.video.ad;
import com.ss.android.ugc.aweme.video.b.q;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.k;
import com.ss.android.ugc.aweme.video.local.f;
import com.ss.android.ugc.aweme.video.n;
import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.aweme.video.simpreloader.m;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.x;
import com.ss.android.ugc.playerkit.session.Session;
import com.toutiao.proxyserver.u;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.z;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class o extends d implements OnUIPlayListener {
    private static boolean Q;
    private static Pair<String, Boolean> R;
    protected boolean A = true;
    public int B;
    public File C;
    protected int D;
    protected String E;
    protected m F = new m();
    protected Map<String, b> G = new LinkedHashMap<String, b>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass7 */

        static {
            Covode.recordClassIndex(58975);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, b> entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }
    };
    public com.ss.android.ugc.aweme.ad.feed.b.c H;
    public a I;
    int J = 0;
    public String K = "";
    protected int L = 0;
    double M = -0.5d;
    int N;
    public i O;
    public String P = "";
    private final WeakReference<al> S;
    private KeyguardManager T;
    private boolean U;
    private long V = -1;
    private final Map<String, Long> W;
    private long X = -1;
    private long Y = -1;
    private long Z = -1;

    /* renamed from: a  reason: collision with root package name */
    protected boolean f92923a;
    private final int aA = 1024;
    private final double aB = -0.5d;
    private boolean aC = true;
    private boolean aD = true;
    private double aE;
    private boolean aF = false;
    private String aG;
    private long aH = -1;
    private final LinkedHashMap<String, Double> aI = new LinkedHashMap<String, Double>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass31 */

        static {
            Covode.recordClassIndex(58971);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Double> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    private final LinkedHashMap<String, String> aJ = new LinkedHashMap<String, String>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass2 */

        static {
            Covode.recordClassIndex(58958);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            if (size() > 100) {
                return true;
            }
            return false;
        }
    };
    private final LinkedHashMap<String, Long> aK = new LinkedHashMap<String, Long>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass3 */

        static {
            Covode.recordClassIndex(58969);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    private final LinkedHashMap<String, Integer> aL = new LinkedHashMap<String, Integer>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass4 */

        static {
            Covode.recordClassIndex(58972);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    private final LinkedHashMap<String, Long> aM = new LinkedHashMap<String, Long>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass5 */

        static {
            Covode.recordClassIndex(58973);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    private long aN;
    private int aO;
    private int aP;
    private boolean aQ;
    private final Map<String, String> aR = new LinkedHashMap<String, String>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass6 */

        static {
            Covode.recordClassIndex(58974);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            if (size() > 5) {
                return true;
            }
            return false;
        }
    };
    private com.ss.android.ugc.aweme.commercialize.feed.c aS;
    private final LinkedHashMap<String, List<Long>> aT = new LinkedHashMap<String, List<Long>>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass9 */

        static {
            Covode.recordClassIndex(58977);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<Long>> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    private final com.ss.android.ugc.aweme.feed.background.b aU = new com.ss.android.ugc.aweme.feed.background.b(this);
    private boolean aV = false;
    private c aW;
    private String aX;
    private boolean aY;
    private Set<String> aZ;
    private boolean aa;
    private LinkedHashMap<String, Boolean> ab = new LinkedHashMap<String, Boolean>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass1 */

        static {
            Covode.recordClassIndex(58947);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    private LinkedHashMap<String, Boolean> ac = new LinkedHashMap<String, Boolean>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass12 */

        static {
            Covode.recordClassIndex(58950);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    private LinkedHashMap<String, Boolean> ad = new LinkedHashMap<String, Boolean>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass23 */

        static {
            Covode.recordClassIndex(58962);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    private LinkedHashMap<String, Long> ae = new LinkedHashMap<String, Long>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass26 */

        static {
            Covode.recordClassIndex(58965);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    private LinkedHashMap<String, Long> af = new LinkedHashMap<String, Long>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass27 */

        static {
            Covode.recordClassIndex(58966);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    private LinkedHashMap<String, Long> ag = new LinkedHashMap<String, Long>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass28 */

        static {
            Covode.recordClassIndex(58967);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    private long ah = 0;
    private long ai = 0;
    private long aj = -1;
    private long ak = -1;
    private int al = 0;
    private int am = 0;
    private long an = -1;
    private long ao = 0;
    private boolean ap;
    private boolean aq;
    private long ar = 0;
    private long as = 0;
    private long at = -1;
    private int au = 0;
    private int av = -10;
    private boolean aw = false;
    private String ax;
    private BroadcastReceiver ay;
    private f.a.g.b az;
    private boolean ba = false;
    private boolean bb = true;
    private volatile boolean bc = false;
    private int bd = -1;
    private boolean be;
    private int bf = -1;
    private boolean bg;
    private Aweme bh = null;
    private String bi = null;
    private Aweme bj;
    private VideoUrlModel bk;
    private ag bl;
    private Surface bm;

    /* renamed from: k  reason: collision with root package name */
    public boolean f92924k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f92925l;

    /* renamed from: m  reason: collision with root package name */
    public LinkedHashMap<String, Boolean> f92926m = new LinkedHashMap<String, Boolean>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass29 */

        static {
            Covode.recordClassIndex(58968);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public LinkedHashMap<String, Boolean> n = new LinkedHashMap<String, Boolean>() {
        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass30 */

        static {
            Covode.recordClassIndex(58970);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public com.ss.android.ugc.aweme.feed.d.a o;
    public int p = 0;
    protected String q;
    protected volatile boolean r = false;
    protected volatile boolean s = false;
    protected Aweme t;
    protected long u;
    public boolean v;
    public Aweme w;
    public boolean x;
    public String y;
    protected boolean z = false;

    public interface a {
        static {
            Covode.recordClassIndex(58978);
        }
    }

    static {
        Covode.recordClassIndex(58946);
    }

    public final void D() {
        this.f92923a = true;
    }

    /* access modifiers changed from: protected */
    public void a(Aweme aweme) {
    }

    /* access modifiers changed from: protected */
    public void a(l lVar, aj ajVar) {
    }

    /* access modifiers changed from: protected */
    public void a(n nVar, aj ajVar, String str, al alVar, Aweme aweme, JSONObject jSONObject) {
    }

    /* access modifiers changed from: protected */
    public void a(String str, al alVar, Aweme aweme) {
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean a(boolean z2) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public OnUIPlayListener getWrapperedListener() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean m() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean o() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedTimeMs(String str, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(String str, l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPrepare(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayRelease(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreParePlay(String str, n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(String str, com.ss.android.ugc.playerkit.model.o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(String str, l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekEnd(String str, boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onSeekStart(String str, int i2, float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoBitrateChanged(String str, com.ss.android.ugc.aweme.player.sdk.b.b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onVideoSizeChanged(String str, int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public boolean p() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final String j() {
        return this.f92899d;
    }

    protected static boolean a(ah ahVar) {
        return ahVar.s() == 2;
    }

    public final aj a(String str) {
        al s2 = s();
        if (s2 == null) {
            return null;
        }
        return s2.k(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(Video video, aj ajVar, n nVar) {
        String str;
        JSONObject jSONObject;
        String str2;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("netWorkQuality", b.a.f48731a.a().toString());
            jSONObject2.put("netWorkSpeed", (int) b.a.f48731a.b());
            jSONObject2.put("playUrl", dw.a(video.getProperPlayAddr()));
            jSONObject2.put("video_duration", video.getDuration());
            com.ss.android.ugc.aweme.video.util.c.a(jSONObject2);
            if (this.C == null) {
                this.C = com.ss.android.ugc.aweme.video.e.a(com.ss.android.ugc.aweme.video.e.a(), "cache");
            }
            File file = this.C;
            if (file == null) {
                str2 = "";
            } else {
                str2 = new com.ss.android.ugc.aweme.shortvideo.l.n("file", file.getPath() + "/" + com.toutiao.proxyserver.g.a.a(video.getPlayAddr().getBitRatedRatioUri())).toString();
            }
            jSONObject2.put("file", str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        com.ss.android.ugc.aweme.app.n.a("type_log_play_succuss", "play_success", jSONObject2);
        com.bytedance.apm.b.a("aweme_media_error_rate", 0, jSONObject2);
        if (VideoBitRateABManager.f143220a.d()) {
            str = "aweme_media_bitrated_error_rate";
        } else {
            str = "aweme_media_original_error_rate";
        }
        com.bytedance.apm.b.a(str, 0, jSONObject2);
        if (g.c(ajVar)) {
            try {
                jSONObject = new JSONObject(jSONObject2.toString());
                jSONObject.put("aweme_id", ajVar.b().getAid());
                jSONObject.put("creative_id", ajVar.b().getAwemeRawAd().getCreativeId());
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(ajVar.b())) {
                    jSONObject.put("is_topview", true);
                }
            } catch (Exception e3) {
                jSONObject = new JSONObject();
                e3.printStackTrace();
            }
            com.bytedance.apm.b.a("aweme_ad_media_play_error_rate", 0, jSONObject);
            if (g.d(ajVar)) {
                com.ss.android.ugc.aweme.commercialize.log.a.a(ajVar.b(), 1, 0);
            }
        }
        if (!g.d(ajVar) || nVar == null) {
            return null;
        }
        if (nVar.f148791c / 1000 > 60 || nVar.f148791c / 1000 < 7) {
            com.ss.android.ugc.aweme.commercialize.log.a.a(ajVar.b(), 4, 1);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("alarm_reason", "duration_alarm");
                if (ajVar.b() != null) {
                    jSONObject3.put("group_id", ajVar.b().getAid());
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            r.onEvent(MobClick.obtain().setEventName("ad_alarm").setLabelName("homepage_hot").setJsonObject(jSONObject3));
            return null;
        }
        com.ss.android.ugc.aweme.commercialize.log.a.a(ajVar.b(), 4, 0);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        if (r3 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.ugc.playerkit.model.n r20, java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.e.o.a(com.ss.android.ugc.playerkit.model.n, java.lang.String):void");
    }

    public final void a(final Video video, final boolean z2) {
        if (video != null) {
            com.ss.android.b.a.a.a.a(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass13 */

                static {
                    Covode.recordClassIndex(58951);
                }

                public final void run() {
                    String str;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playUrl", dw.a(video.getPlayAddrBytevc1()));
                        com.ss.android.ugc.aweme.video.util.c.a(jSONObject);
                        if (o.this.C == null) {
                            o.this.C = com.ss.android.ugc.aweme.video.e.a(com.ss.android.ugc.aweme.video.e.a(), "cache");
                        }
                        File file = o.this.C;
                        if (file == null) {
                            str = "";
                        } else {
                            str = new com.ss.android.ugc.aweme.shortvideo.l.n("file", file.getPath() + "/" + com.toutiao.proxyserver.g.a.a(video.getProperPlayAddr().getUri())).toString();
                        }
                        jSONObject.put("file", str);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    com.bytedance.apm.b.a("aweme_media_bytevc1_error_rate", !z2 ? 1 : 0, jSONObject);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2, Aweme aweme) {
        System.currentTimeMillis();
        com.ss.android.ugc.aweme.feed.c.a(this.f92899d, this.f92900e, str, i2, aweme, aweme == null ? v() : aweme.getRequestId());
        if (TextUtils.equals("from_follow_often_watch", f())) {
            com.ss.android.ugc.aweme.feed.c.a(this.f92900e, str, i2);
        }
        System.currentTimeMillis();
    }

    protected static boolean a(aj ajVar, String str) {
        return h(ajVar) && m.a(ajVar.b().getAid(), str);
    }

    /* access modifiers changed from: protected */
    public final void b(l lVar, aj ajVar) {
        if (lVar != null && ajVar != null && ajVar.b() != null && ajVar.b().getVideo() != null) {
            Aweme b2 = ajVar.b();
            Video video = ajVar.b().getVideo();
            String c2 = c(this.E);
            JSONObject jSONObject = new JSONObject();
            boolean c3 = com.ss.android.ugc.aweme.feed.cache.e.c(ajVar.b().getAid());
            try {
                jSONObject.put("error_code", String.valueOf(lVar.f148749d));
                jSONObject.put("error_internal_code", String.valueOf(lVar.f148750e));
                jSONObject.put("error_info", String.valueOf(lVar.f148751f));
                jSONObject.put("group_id", ajVar.b().getAid());
                jSONObject.put("video_id", com.ss.android.ugc.playerkit.c.b.f148656b);
                int i2 = 1;
                jSONObject.put("is_bytevc1", String.valueOf(lVar.f148747b ? 1 : 0));
                jSONObject.put("is_dash", String.valueOf(lVar.f148748c ? 1 : 0));
                jSONObject.put("is_ad", String.valueOf(com.ss.android.ugc.aweme.commercialize.e.a.b.s(b2) ? 1 : 0));
                jSONObject.put("is_splash", String.valueOf(com.ss.android.ugc.aweme.commercialize.e.a.b.G(b2) ? 1 : 0));
                jSONObject.put("internet_speed", String.valueOf(com.ss.android.ugc.h.g.f()));
                jSONObject.put("cache_size", String.valueOf(ac.c(video.getPlayAddr())));
                jSONObject.put("video_size", String.valueOf(ac.d(video.getPlayAddr())));
                jSONObject.put("play_url", video.getPlayAddr() == null ? "null" : video.getPlayAddr().toString());
                jSONObject.put("player_type", M().a().toString());
                jSONObject.put("is_from_feed_cache", String.valueOf(c3 ? 1 : 0));
                if (!com.ss.android.ugc.aweme.feed.background.c.a()) {
                    i2 = 0;
                }
                jSONObject.put("is_audio_mode", String.valueOf(i2));
                jSONObject.put("has_tts", com.ss.android.ugc.aweme.feed.x.ah.i(b2));
                jSONObject.put("has_cla", com.ss.android.ugc.aweme.feed.x.ah.h(b2));
                jSONObject.put("play_sess", c2);
                jSONObject.put("eco", String.valueOf(com.ss.android.ugc.aweme.setting.l.d()));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.F.f92921b.remove(this.E);
            com.ss.android.ugc.aweme.bm.b.b("video_play_failed", jSONObject);
            r.a("video_play_failed", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", String.valueOf(lVar.f148749d));
                jSONObject2.put("error_internal_code", String.valueOf(lVar.f148750e));
                jSONObject2.put("internet_speed", String.valueOf(com.ss.android.ugc.h.g.f()));
                n.a("error", jSONObject2.toString());
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(j jVar) {
        al s2 = s();
        jVar.f128598e = (s2 == null || !s2.F()) ? 1 : 2;
        com.ss.android.ugc.d.a.c.a(jVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(long j2, long j3, boolean z2, aj ajVar, int i2, String str, String str2, al alVar, String str3) {
        int i3;
        s a2 = new s().a("request_id", u().optString("request_id"));
        long j4 = 0;
        if (j2 > 0) {
            j4 = j3 - j2;
        }
        s a3 = a2.a("duration", Long.toString(j4));
        if (z2) {
            i3 = -1;
        } else {
            i3 = com.ss.android.ugc.aweme.metrics.b.a.f109531a ? 1 : 0;
        }
        s a4 = a3.a("is_first", String.valueOf(i3)).a("group_id", ajVar.b().getAid()).a("vduration", String.valueOf(i2)).a("is_from_feed_cache", String.valueOf(z2 ? 1 : 0));
        Context a5 = com.bytedance.ies.ugc.appcontext.d.a();
        if (TextUtils.isEmpty(com.ss.android.ugc.aweme.lancet.j.f107223b) || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107223b = com.bytedance.common.utility.l.e(a5);
        }
        JSONObject a6 = a4.a("access", com.ss.android.ugc.aweme.lancet.j.f107223b).a("top_activity", str).a("feed_tab", str2).a("is_ad", String.valueOf(com.ss.android.ugc.aweme.commercialize.e.a.b.s(ajVar.b()) ? 1 : 0)).a("is_splash", String.valueOf(com.ss.android.ugc.aweme.commercialize.e.a.b.G(ajVar.b()) ? 1 : 0)).a("is_audio_mode", String.valueOf(com.ss.android.ugc.aweme.feed.background.c.a() ? 1 : 0)).a("enter_from", alVar != null ? alVar.a_(true) : "").a();
        try {
            a6.put("has_tts", com.ss.android.ugc.aweme.feed.x.ah.i(ajVar.b())).put("has_cla", com.ss.android.ugc.aweme.feed.x.ah.h(ajVar.b())).put("preloader_type", q.b());
            a6.put("play_sess", str3);
        } catch (Exception e2) {
            com.bytedance.c.a.a.a.b.a(e2);
        }
        r.onEvent(MobClick.obtain().setEventName("video_request").setLabelName("perf_monitor").setValue(ajVar.b().getAid()).setJsonObject(a6));
        r.a("video_request", a6);
        com.ss.android.ugc.aweme.metrics.b.a.a("video_request", a6);
        com.ss.android.ugc.aweme.bm.b.b("video_request", a6);
        return null;
    }

    private boolean a(User user) {
        if (this.aZ == null) {
            this.aZ = new HashSet();
        }
        if (this.aZ.contains(user.getUid())) {
            return true;
        }
        this.aZ.add(user.getUid());
        return false;
    }

    private void a(boolean z2, boolean z3) {
        if (this.f92925l) {
            aj w2 = w();
            if (g.e(w2)) {
                this.aq = z2;
                if (z2) {
                    this.am++;
                    if (this.an == -1) {
                        this.an = SystemClock.elapsedRealtime();
                    }
                } else if (this.an != -1) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.an;
                    this.ao += elapsedRealtime;
                    this.an = -1;
                    if (!z3 && elapsedRealtime >= ((long) com.bytedance.ies.abmock.b.a().a(true, "video_buffering_threshold", 0))) {
                        a(c(w2), w2, elapsedRealtime, "resume", false);
                    }
                }
            }
        }
    }

    private void a(String str, boolean z2, boolean z3) {
        if (z2) {
            if (!j(str)) {
                d(str, true);
            } else {
                d(str, false);
            }
        }
        j(str);
        i(str);
        if (!z2) {
            Long.valueOf(e(str));
        }
        if (j(str)) {
            if (!z2 && i(str) && com.ss.android.ugc.aweme.player.c.h()) {
                g(str);
                c(str, g(str));
            }
            final al s2 = s();
            aj w2 = w();
            if (g.e(w2)) {
                int i2 = com.ss.android.ugc.aweme.feed.experiment.al.f93047a;
                int i3 = com.ss.android.ugc.aweme.player.c.h() ? ak.f93046a : 0;
                if (z2) {
                    d(str, SystemClock.elapsedRealtime());
                    this.al++;
                    if (e(str) == -1) {
                        SystemClock.elapsedRealtime();
                        c(str, SystemClock.elapsedRealtime());
                    }
                    P();
                    this.az = (f.a.g.b) t.b((long) i3, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).c(new f.a.g.b<Long>() {
                        /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass15 */

                        static {
                            Covode.recordClassIndex(58953);
                        }

                        @Override // f.a.z
                        public final void onError(Throwable th) {
                        }

                        @Override // f.a.z
                        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                        }

                        @Override // f.a.z
                        public final void onComplete() {
                            al alVar = s2;
                            if (alVar != null) {
                                alVar.av();
                            }
                        }
                    });
                    if (w2.p().O() != null) {
                        w2.p().O().b(this.al);
                    }
                } else {
                    if (e(str) != -1) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - e(str);
                        this.ah += elapsedRealtime;
                        if (!z3 && elapsedRealtime >= ((long) i2)) {
                            a(str, w2, elapsedRealtime, "resume", true, i(str));
                            c(str, -1);
                        }
                        if (w2.p().O() != null) {
                            w2.p().O().a(this.ah);
                        }
                    }
                    if (!z3) {
                        d(str, 0);
                        c(str, false);
                        d(str, false);
                    }
                    P();
                    if (s2 != null) {
                        s2.at();
                    }
                }
                a(new j(z2));
                m.a.a().c(str);
            }
        }
    }

    private void a(String str, aj ajVar, long j2, String str2, boolean z2) {
        a(str, ajVar, j2, str2, z2, i(str));
    }

    private void a(String str, aj ajVar, long j2, String str2, boolean z2, boolean z3) {
        b.i.b(new aa(this, ajVar, str, j2, str2, z2, z3), r.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(aj ajVar, String str, long j2, String str2, boolean z2, boolean z3) {
        String str3;
        VideoUrlModel playAddr;
        com.ss.android.ugc.aweme.video.preload.m j3;
        Aweme b2 = ajVar.b();
        JSONObject b3 = b(str, ajVar, j2, str2, z2, z3);
        b3.put("has_tts", com.ss.android.ugc.aweme.feed.x.ah.i(b2));
        b3.put("has_cla", com.ss.android.ugc.aweme.feed.x.ah.h(b2));
        String str4 = "video_block";
        com.ss.android.ugc.aweme.bm.b.b(z2 ? str4 : "video_decoder_block", b3);
        if (z2) {
            if (!(ajVar.b() == null || ajVar.b().getVideo() == null || (playAddr = ajVar.b().getVideo().getPlayAddr()) == null || (j3 = com.ss.android.ugc.aweme.video.preload.s.b().j(com.ss.android.ugc.aweme.video.simcommon.a.a(playAddr))) == null)) {
                try {
                    b3.put("video_cache_read_time", (double) ((((float) j3.f143728a) * 1.0f) / ((float) j3.f143730c)));
                    b3.put("video_cache_read_size", (double) ((((float) j3.f143729b) * 1.0f) / ((float) j3.f143730c)));
                    b3.put("video_cache_read_cnt", j3.f143730c);
                    b3.put("video_cache_use_ttnet", u.f154997l);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            b3.put("eco", com.ss.android.ugc.aweme.setting.l.d());
            str3 = "aweme_block_bitrate_netspeed_log";
        } else {
            str3 = "aweme_block_decoder_log";
        }
        com.ss.android.ugc.aweme.app.n.a(str3, b3);
        if (!z2) {
            str4 = "video_decoder_block";
        }
        r.a(str4, b3);
        if (z2) {
            ((ITranssonicService) com.ss.android.ugc.aweme.preinstall.b.f115714a.getValue()).onVideoPlayBlock();
        }
        h.f.b.l.d("block", "");
        IRuntimeBehaviorService c2 = RuntimeBehaviorServiceImpl.c();
        if (c2 == null) {
            return null;
        }
        c2.a("block");
        return null;
    }

    private void a(String str, aj ajVar, Aweme aweme, VideoUrlModel videoUrlModel, com.ss.android.ugc.playerkit.model.o oVar, Long l2, long j2, int i2) {
        boolean z2;
        aj bf2;
        al s2 = s();
        if (ajVar != null && aweme != null) {
            b bVar = this.G.get(str);
            int i3 = bVar != null ? bVar.f92963b : -1;
            PreloadSessionManager.PreloadSession b2 = PreloadSessionManager.f143503a.b(str);
            int f2 = (b2 == null || this.aO <= 0) ? com.ss.android.ugc.h.g.f() : b2.speed;
            d.a aVar = new d.a();
            com.ss.android.ugc.aweme.feed.helper.d S2 = ajVar.S();
            if (S2 != null) {
                aVar.a(S2);
            }
            String c2 = c(str);
            Pair<String, Boolean> pair = R;
            int i4 = 0;
            if (pair == null || !TextUtils.equals(str, (CharSequence) pair.first) || ((Boolean) R.second).booleanValue()) {
                z2 = false;
            } else {
                R = new Pair<>(str, true);
                z2 = true;
            }
            if (com.ss.android.ugc.aweme.story.d.a.d(aweme) && (bf2 = s2.bf()) != null) {
                ay.a(aVar, bf2.b(), aweme);
            }
            long j3 = this.aH;
            boolean z3 = (j3 == -1 || j3 == oVar.getTid()) ? false : true;
            this.aH = oVar.getTid();
            i M2 = M();
            int N2 = M2.N();
            int M3 = M2.M();
            d.a a2 = aVar.a(aweme).a(videoUrlModel).a(oVar).a(d()).a(s2).a((i) s2).a(g(ajVar)).g(this.f92900e).a(String.valueOf(l2)).a(j2).b(this.aO).c(this.aP).a().e(f2).f(i2).h(oVar.getAccertSessionPrepareType()).a(z2);
            if (!ajVar.T() && com.ss.android.ugc.aweme.player.c.c()) {
                i4 = 1;
            }
            a2.d(i4).a(i3).a("play_sess", c2).b(oVar.getRenderDisplayed()).c(z3).l(M3).m(N2).d(com.ss.android.ugc.aweme.feed.background.c.a()).f114983a.a();
        }
    }

    public final void a(VideoUrlModel videoUrlModel) {
        float i2 = M().i();
        Integer a2 = com.ss.android.ugc.aweme.feed.x.j.a(videoUrlModel);
        if (a2 != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("play_bitrate", (double) i2);
                jSONObject.put("bitrate", a2);
                jSONObject.put("bitrate_delta", (double) (((float) a2.intValue()) - i2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.ss.android.ugc.aweme.app.n.a("http_hijack_info_v2", "http_hijack_info_v2", jSONObject);
        }
        if (ae.f93032a && a2 != null && a2.intValue() > 0 && ((float) a2.intValue()) - i2 > ((float) am.f93048a)) {
            com.ss.android.ugc.aweme.video.q.a();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("play_bitrate", (double) i2);
                jSONObject2.put("hit_bitrate", a2);
                jSONObject2.put("is_hijack", 1);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            com.ss.android.ugc.aweme.app.n.a("http_hijack_info", jSONObject2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(com.ss.android.ugc.aweme.feed.model.Aweme r13, int r14) {
        /*
        // Method dump skipped, instructions count: 600
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.e.o.a(com.ss.android.ugc.aweme.feed.model.Aweme, int):java.lang.String");
    }

    private static boolean a(aj ajVar, Aweme aweme) {
        return h(ajVar) && ajVar.b() == aweme;
    }

    public final String a(Aweme aweme, boolean z2, aj ajVar) {
        Video video;
        boolean z3;
        int i2;
        al s2 = s();
        if (s2 != null) {
            s2.ao();
        }
        aj w2 = ajVar == null ? w() : ajVar;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme)) {
            if (w2 == null) {
                return "27";
            }
            a(aweme, w2.t());
            return "27";
        } else if (com.ss.android.ugc.aweme.story.d.a.e(aweme)) {
            F();
            w2.W();
            return "";
        } else if (w2 == null) {
            return "12";
        } else {
            if (!f.f143475a) {
                com.ss.android.ugc.aweme.base.utils.o.a(w2.p().y(), 0);
            }
            if ((!a(w2, aweme) || (!w2.p().w() && !f.f143475a)) && !com.ss.android.ugc.aweme.feed.background.c.a()) {
                return "22";
            }
            b.i.b(s.f92973a, com.ss.android.ugc.aweme.cw.g.c());
            Audio audio = null;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aw(aweme)) {
                video = r().a();
            } else {
                video = w2.b().getVideo();
                audio = w2.b().getAudio();
            }
            if (a(w2.p()) && n()) {
                b(w2, aweme);
                a(c(w2), false);
                return "14";
            } else if (com.ss.android.ugc.aweme.login.b.a.a(aweme)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(d()).a(com.ss.android.ugc.aweme.login.b.a.a(aweme, R.string.har)).a();
                return "15";
            } else if (b(aweme)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(d()).a(R.string.h_6).a();
                return "16";
            } else if (video == null) {
                return "17";
            } else {
                if (video.getProperPlayAddr() == null) {
                    return "18";
                }
                if (!aweme.isLive() && !aweme.isCanPlay()) {
                    return "19";
                }
                M();
                i M2 = M();
                M2.a(w2.p().x());
                aweme.getDesc();
                w2.p().x();
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.aw(aweme)) {
                    video.setRationAndSourceId(r().b());
                } else {
                    video.setRationAndSourceId(c(w2));
                }
                if (w2.t() != null) {
                    w2.t().F();
                }
                if (!c(aweme) || !n()) {
                    return "21";
                }
                M2.a(K());
                if (ajVar == null || ajVar.e() == null || !ajVar.e().f91900a) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                com.ss.android.ugc.aweme.video.c.a aVar = new com.ss.android.ugc.aweme.video.c.a();
                aVar.f143352f = z3;
                aVar.f143349c = z2;
                bd t2 = w2.t();
                com.ss.android.ugc.aweme.ad.feed.a.b S2 = S();
                if (S2 == null || !S2.a(aweme, 0)) {
                    i2 = 0;
                } else {
                    int a2 = (int) S2.a();
                    if (a2 >= 0) {
                        a(aweme, t2);
                        S2.a(true);
                        com.ss.android.ugc.aweme.ad.feed.a.b.f65742b = false;
                        com.ss.android.ugc.aweme.commercialize.n.b.f74918b.a();
                        i2 = a2;
                    } else {
                        i2 = 0;
                    }
                    h.f.b.l.d("getContinuousPlayTime, pausePositon:".concat(String.valueOf(a2)), "");
                }
                aa.c("tryPlay", M2.a(new com.ss.android.ugc.aweme.video.c.b(video, audio, com.ss.android.ugc.aweme.video.d.a.SuperHigh, i2, aVar, com.ss.android.ugc.aweme.video.util.d.a(video, w2.X()), w2.X(), aweme.getVideo().getDuration() <= 15000 || com.ss.android.ugc.aweme.story.d.a.d(aweme))));
                if (l()) {
                    a(aweme, M2, true);
                }
                a(c(w2), false);
                return "20";
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Aweme aweme, i iVar, boolean z2) {
        if (f(aweme)) {
            iVar.F();
        } else if (aweme == null || aweme.getStatus() == null || aweme.getStatus().getVideoMuteInfo() == null) {
            iVar.G();
        } else {
            if (aweme.getStatus().getVideoMuteInfo().isMute()) {
                iVar.F();
            } else {
                iVar.G();
            }
            if (z2 && !TextUtils.isEmpty(aweme.getStatus().getVideoMuteInfo().getMuteDesc())) {
                new com.ss.android.ugc.aweme.tux.a.i.a(d()).a(aweme.getStatus().getVideoMuteInfo().getMuteDesc()).a();
            }
        }
    }

    public final void a(String str, boolean z2, aj ajVar) {
        T();
        long H2 = H();
        if (ajVar == null) {
            ajVar = w();
        }
        if (g.e(ajVar)) {
            IAdSceneService f2 = AdSceneServiceImpl.f();
            if (f2 != null && !this.aF) {
                if (!z2 || this.t == null) {
                    f2.c().a(a(w()), d(), this.t, str, H2, this.p + 1, com.ss.android.ugc.aweme.ad.feed.g.a());
                } else {
                    com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a c2 = f2.c();
                    Aweme a2 = a(w());
                    Context d2 = d();
                    Aweme aweme = this.t;
                    c2.a(a2, d2, aweme, aweme.getAid(), H2, this.p + 1, com.ss.android.ugc.aweme.ad.feed.g.a());
                }
            }
            Aweme aweme2 = this.t;
            if (aweme2 != null && aweme2.isAd()) {
                this.t.getAwemeRawAd().setReshowAd(true);
            }
            this.t = a(ajVar);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r44, long r45) {
        /*
        // Method dump skipped, instructions count: 691
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.e.o.a(java.lang.String, long):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(Aweme aweme, String str, String str2, al alVar, aj ajVar, long j2, String str3, String str4, String str5, double d2, String str6, i iVar, String str7, String str8, String str9, String str10, String str11, String str12) {
        String str13;
        String str14;
        if (com.ss.android.ugc.aweme.feed.background.c.a()) {
            return null;
        }
        JSONObject u2 = u();
        try {
            u2.put("author_id", com.ss.android.ugc.aweme.metrics.ac.a(aweme));
            u2.put("detail", V() ? 1 : 0);
            u2.put("content_source", str);
            if (!TextUtils.isEmpty(str2)) {
                u2.put("enter_method", str2);
            }
            com.ss.android.ugc.aweme.feed.param.b as2 = alVar.as();
            if (!TextUtils.isEmpty(as2.getCarrierType())) {
                u2.put("carrier_type", alVar.as().getCarrierType());
            }
            if (!TextUtils.isEmpty(as2.getFromGroupId())) {
                u2.put("from_group_id", alVar.as().getFromGroupId());
            }
            if (!TextUtils.isEmpty(as2.getReferCommodityId())) {
                u2.put("refer_commodity_id", alVar.as().getReferCommodityId());
            }
            if (!TextUtils.isEmpty(as2.getDataType())) {
                u2.put("data_type", alVar.as().getDataType());
            }
            if (!TextUtils.isEmpty(as2.getSpecialTopicRegion())) {
                u2.put("region", alVar.as().getSpecialTopicRegion());
            }
            u2.put("is_highlighted", aweme.isHighlighted());
            u2.put("rank_index", aweme.getOriginalPos());
            u2.put("has_tts", com.ss.android.ugc.aweme.feed.x.ah.i(aweme));
            u2.put("has_cla", com.ss.android.ugc.aweme.feed.x.ah.h(aweme));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (g.c(ajVar)) {
            r.onEvent(MobClick.obtain().setEventName("ad_play_time").setValue(String.valueOf(j2)).setExtValueString(com.ss.android.ugc.aweme.metrics.ac.e(aweme)).setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("request_id", u().optString("request_id")).a("is_photo", com.ss.android.ugc.aweme.metrics.ac.f(aweme)).a()));
        }
        com.ss.android.ugc.aweme.feed.c.f92673a = String.valueOf(j2);
        HotListStruct hotListStruct = aweme.getHotListStruct();
        if (hotListStruct == null || hotListStruct.getTitile() == null || hotListStruct.getType() != 2) {
            com.ss.android.ugc.aweme.feed.c.f92674b = "";
        } else {
            com.ss.android.ugc.aweme.feed.c.f92674b = hotListStruct.getTitile();
        }
        d();
        r.a("play_time", this.f92899d, str3, j2, u2);
        boolean z2 = aweme.getBottomBarModel() != null;
        if (aweme.getMusic() != null) {
            str13 = String.valueOf(aweme.getMusic().getId());
        } else {
            str13 = "";
        }
        com.ss.android.ugc.aweme.feed.param.b as3 = alVar.as();
        as a2 = new as().a(this.f92899d);
        a2.ah = this.f92901f;
        a2.u = str4;
        a2.v = str5;
        a2.X = z2;
        as f2 = ((as) a2.a(Boolean.valueOf(com.ss.android.ugc.aweme.feed.x.m.b(aweme)))).g(aweme);
        f2.f109523a = j2;
        f2.t = d2;
        as asVar = (as) f2.c(str6);
        asVar.ag = alVar.ai();
        asVar.f109525c = iVar.a().toString();
        asVar.f109526d = com.ss.android.ugc.aweme.metrics.ac.a(aweme, this.f92900e);
        as a3 = asVar.a(iVar.h());
        a3.r = str7;
        a3.s = str8;
        a3.q = str9;
        as asVar2 = (as) a3.d(com.ss.android.ugc.aweme.metrics.ac.b(aweme, this.f92900e));
        asVar2.p = str;
        asVar2.aj = str10;
        asVar2.ak = str11;
        asVar2.Z = aweme.isHighlighted();
        asVar2.Y = aweme.getOriginalPos();
        asVar2.ao = str12;
        asVar2.ap = str13;
        asVar2.as = as3.getPlaylistSearchId();
        asVar2.ar = as3.getIsFromVideo();
        asVar2.aq = as3.getCategoryName();
        asVar2.at = this.f92899d;
        asVar2.au = as3.getLastGroupId();
        asVar2.av = as3.getPlaylistPreviousPage();
        asVar2.aw = as3.getEnterPlaylistGroupId();
        String str15 = "1";
        asVar2.ax = com.ss.android.ugc.aweme.feed.x.ah.k(aweme) ? str15 : "0";
        if (com.ss.android.ugc.aweme.feed.x.ah.j(aweme)) {
            str14 = str15;
        } else {
            str14 = "0";
        }
        asVar2.ay = str14;
        asVar2.aB = as3.getIsFromPlaylist();
        asVar2.aA = aweme.getCaptionReturnCount();
        asVar2.az = aweme.getCaptionLength();
        if (as3.extra != null) {
            HashMap<String, String> hashMap = as3.extra;
            if (hashMap.containsKey("token_type")) {
                asVar2.a("token_type", hashMap.get("token_type"));
            }
        }
        if (!TextUtils.isEmpty(as3.getNewsId())) {
            asVar2.m(as3.getNewsId());
        }
        if (a(this.f92899d, str6)) {
            if (!aweme.isTop()) {
                str15 = "0";
            }
            asVar2.e(str15);
        }
        if (com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
            com.ss.android.ugc.aweme.metrics.c unused = h.a(asVar2, com.ss.android.ugc.aweme.story.g.f137757a.e().a(aweme.getAuthorUid()), aweme, com.ss.android.ugc.aweme.story.b.i.a(as3), null, null);
        }
        if (this.f92902g != null) {
            asVar2.f109527e = this.f92902g;
        }
        asVar2.a(y.b(str4, as3.getFromGroupId()));
        String.valueOf(j2);
        if (this.I != null) {
            aweme.getAid();
        }
        String O2 = alVar.O();
        if (!TextUtils.isEmpty(O2)) {
            try {
                JSONObject jSONObject = new JSONObject(O2);
                if (jSONObject.has("supplier_id")) {
                    asVar2.a("supplier_id", jSONObject.getString("supplier_id"));
                }
                if (jSONObject.has("product_id")) {
                    asVar2.a("product_id", jSONObject.getString("product_id"));
                }
                if (jSONObject.has("previous_page")) {
                    asVar2.a("previous_page", jSONObject.getString("previous_page"));
                }
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        asVar2.aa = as3.getCarrierType();
        asVar2.ab = as3.getReferSeedId();
        asVar2.ac = as3.getReferSeedName();
        asVar2.ad = as3.getFromGroupId();
        asVar2.af = as3.getReferCommodityId();
        asVar2.ae = as3.getDataType();
        asVar2.o(as3.getCreationId());
        asVar2.i(as3.getListItemId());
        asVar2.g(as3.getListResultType());
        asVar2.j(as3.getSearchThirdItemId());
        asVar2.al = as3.getmImprId();
        asVar2.l(as3.getSearchId());
        asVar2.ai = as3.getSpecialTopicRegion();
        Context d3 = d();
        h.f.b.l.d(d3, "");
        new com.ss.android.ugc.aweme.metrics.j(MobParamProvider.a.a(d3).f93688a).installToMetrics(asVar2);
        asVar2.am = as3.getFeedGroupIdForMixVideo();
        String e4 = TextUtils.isEmpty(as3.getVsResultId()) ? com.ss.android.ugc.aweme.metrics.ac.e(aweme) : as3.getVsResultId();
        asVar2.l(as3.getSearchId());
        asVar2.P = as3.getVsEnterFrom();
        asVar2.Q = as3.getVsEntranceType();
        asVar2.R = as3.getVsSessionId();
        asVar2.S = e4;
        asVar2.T = as3.getVsGroupId();
        String searchResultId = as3.getSearchResultId();
        if (!TextUtils.isEmpty(as3.getCidFromSearch())) {
            searchResultId = as3.getCidFromSearch();
        } else if (asVar2.i()) {
            searchResultId = com.ss.android.ugc.aweme.metrics.ac.e(aweme);
        } else if (TextUtils.equals(this.f92899d, "general_search") && TextUtils.isEmpty(searchResultId)) {
            searchResultId = com.ss.android.ugc.aweme.metrics.ac.e(aweme);
        }
        asVar2.f(searchResultId);
        asVar2.an = as3.getSearchType();
        if (!TextUtils.isEmpty(str2)) {
            asVar2.f109527e = str2;
        }
        asVar2.a(w.a(aweme, "play_time", this.f92899d));
        if (!(com.ss.android.ugc.aweme.poi_api.service.c.f115540d == null || com.ss.android.ugc.aweme.poi_api.service.c.a() == null)) {
            asVar2.a(com.ss.android.ugc.aweme.poi_api.service.c.a().a(as3.getPagePoiId(), aweme));
        }
        com.ss.android.ugc.aweme.upvote.event.c.a(asVar2, aweme, this.f92899d);
        asVar2.f();
        String ah2 = alVar.ah();
        if (this.f92899d.equals("playlist")) {
            ah2 = as3.getPlaylistPreviousPage();
        }
        if (!TextUtils.equals(ah2, "search_result") && !TextUtils.equals(ah2, "general_search")) {
            return null;
        }
        SearchResultStatisticsImpl.a().a(new com.ss.android.ugc.aweme.discover.mob.r("search_play_time", aweme, this.f92899d, j2, TextUtils.equals(ah2, "search_result"), ah2, str5, as3.getPlaylistOffset() + ((long) alVar.g(aweme))));
        return null;
    }

    public final void a(Aweme aweme, boolean z2, boolean z3) {
        al s2 = s();
        aj w2 = w();
        if (com.ss.android.ugc.aweme.login.b.a.a(aweme)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(d()).a(com.ss.android.ugc.aweme.login.b.a.a(aweme, R.string.har)).a();
            return;
        }
        boolean z4 = false;
        if (w2 instanceof com.ss.android.ugc.aweme.feed.adapter.ae) {
            if (((com.ss.android.ugc.aweme.feed.adapter.ae) w2).o()) {
                if (s2 != null) {
                    s2.au();
                } else {
                    com.ss.android.ugc.aweme.framework.a.a.a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                }
            } else if (!z2) {
            } else {
                if (s2 != null) {
                    s2.aw();
                } else {
                    com.ss.android.ugc.aweme.framework.a.a.a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                }
            }
        } else if (w2 != null && w2.b() == aweme && !b(aweme)) {
            UgAllServiceImpl.c();
            if (aweme == null) {
                return;
            }
            if (aweme.getVideo() != null || aweme.isLive()) {
                int i2 = this.o.f92885a;
                com.ss.android.ugc.aweme.framework.a.a.b(3, "PlayerController", "current play status:".concat(String.valueOf(i2)));
                if (i2 == 2 || (com.ss.android.ugc.aweme.feed.background.c.a() && i2 == 1)) {
                    if (!aweme.isLive()) {
                        d();
                        r.a("click", "video_pause", aweme.getAid(), 0);
                        ao aoVar = new ao();
                        int i3 = this.f92900e;
                        aoVar.f109510d = aweme;
                        aoVar.f109509c = RequestIdService.a().a(aweme, i3);
                        aoVar.f109508b = com.ss.android.ugc.aweme.metrics.ac.e(aweme);
                        if (!TextUtils.isEmpty(aweme.partN)) {
                            aoVar.f109511e = 2;
                        } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                            aoVar.f109511e = 1;
                        }
                        aoVar.a(this.f92899d).f();
                        M().B();
                        if (z2) {
                            if (s2 != null) {
                                s2.aw();
                            } else {
                                com.ss.android.ugc.aweme.framework.a.a.a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                            }
                        }
                        if (z3) {
                            this.aQ = true;
                        }
                        k.a().c();
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.f(a(w()), this.f92899d, this.f92900e, 1, s2));
                        return;
                    }
                    com.ss.android.ugc.aweme.framework.a.a.b(6, "PlayerController", "aweme is live aweme,maybe is bug?");
                } else if (i2 == 3) {
                    d();
                    r.a("click", "video_play", aweme.getAid(), 0);
                    if (aweme.isLive()) {
                        if (m()) {
                            k.a();
                            w2.p().x();
                            k.a();
                            aweme.getAid();
                            aweme.getStreamUrlModel();
                        } else {
                            ah p2 = w2.p();
                            if (p2.s() == 2) {
                                p2.b(aweme);
                            }
                        }
                        M().B();
                    } else if (aweme.getVideo().getProperPlayAddr() == null) {
                        com.ss.android.ugc.aweme.framework.a.a.a((Exception) new IllegalStateException("try resume play,but model is null"));
                        return;
                    } else {
                        a(aweme, 0);
                    }
                    if (s2 != null) {
                        s2.au();
                    } else {
                        com.ss.android.ugc.aweme.framework.a.a.a((Exception) new IllegalStateException("listFragmentPanel is null!"));
                    }
                } else if (i2 != 0 || s2 == null || !s2.ax()) {
                    com.ss.android.ugc.aweme.framework.a.a.b(6, "PlayerController", "status:" + i2 + ",don't know how to do in this situation");
                } else {
                    a(s2.aD(), true, (aj) null);
                    s2.au();
                }
            }
        } else if (d() == null || !b(aweme)) {
            StringBuilder append = new StringBuilder("try to handlePlay, but can't meet the conditions, holder:").append(w2 == null).append(", player:");
            if (w2 == null) {
                z4 = true;
            }
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new IllegalStateException(append.append(z4).toString()));
        } else {
            new com.ss.android.ugc.aweme.tux.a.i.a(d()).a(R.string.h_6).a();
        }
    }

    public final void a(int i2, boolean z2) {
        if (com.ss.android.ugc.aweme.player.c.c()) {
            boolean z3 = false;
            if (!com.ss.android.ugc.aweme.player.a.f114913a ? com.bytedance.ies.abmock.b.a().a(true, "player_scroll_prerender_enable", 1) == 1 : ((Boolean) com.ss.android.ugc.aweme.player.c.f115054c.getValue()).booleanValue()) {
                if (!(this.bd == i2 && this.be == z2)) {
                    this.bd = i2;
                    this.be = z2;
                    boolean z4 = !z2;
                    if (com.ss.android.ugc.aweme.player.a.f114913a) {
                        z3 = ((Boolean) com.ss.android.ugc.aweme.player.c.f115056e.getValue()).booleanValue();
                    } else if (com.bytedance.ies.abmock.b.a().a(true, "player_prerender_need_scroll_check_cache", 0) == 1) {
                        z3 = true;
                    }
                    a(1, z4, z3);
                    if (com.ss.android.ugc.aweme.feed.experiment.a.a()) {
                        boolean z5 = !z2;
                        Aweme a2 = a(w());
                        al s2 = s();
                        if (!(s2 == null || a2 == null)) {
                            Aweme r2 = !z5 ? s2.r(a2) : s2.i(a2);
                            aj a3 = a(r2.getAid());
                            if (g.a(a3) && f(a3) != null) {
                                this.bh = r2;
                                com.ss.android.ugc.aweme.commercialize.g.e().a(a3.b(), d(), f(a3), s2.h(a2));
                            }
                        }
                    }
                }
            }
        }
        if (!(this.bf == i2 && this.bg == z2)) {
            Aweme a4 = a(w());
            al s3 = s();
            if (!(s3 == null || a4 == null)) {
                Aweme r3 = z2 ? s3.r(a4) : s3.i(a4);
                if (r3 != null && r3.isAd() && com.ss.android.ugc.aweme.feed.ab.a.f91461b) {
                    com.ss.android.ugc.aweme.commercialize.g.a().v(d(), r3);
                }
            }
        }
        this.bf = i2;
        this.bg = z2;
    }

    public final void b(aj ajVar) {
        AwemeRawAd awemeRawAd;
        String aid;
        if (ajVar == null) {
            ajVar = w();
        }
        this.aX = "";
        int i2 = 0;
        if (this.U) {
            Aweme aweme = this.t;
            if (aweme == null) {
                aid = "";
            } else {
                aid = aweme.getAid();
            }
            a(aid, false, ajVar);
        } else {
            if (TextUtils.equals(this.f92899d, "general_search") && this.t == null && com.ss.android.ugc.aweme.commercialize.e.a.b.s(a(w()))) {
                this.t = a(w());
            }
            if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b && com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.a(a(w()))) {
                this.t = a(w());
            }
        }
        this.p = 0;
        if (g.e(ajVar)) {
            ajVar.t().a(this.p);
        }
        this.U = false;
        Aweme a2 = a(ajVar);
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aw(a2)) {
            com.ss.android.ugc.aweme.commercialize.feed.c r2 = r();
            r2.f74189a = a2;
            c.a.a(r2);
            r2.f74191c = 0;
            r2.f74192d = 0;
            r2.f74190b.clear();
            if (!(a2 == null || (awemeRawAd = a2.getAwemeRawAd()) == null)) {
                h.f.b.l.b(awemeRawAd, "");
                Video video = a2.getVideo();
                if (video != null) {
                    video.setRationAndSourceId(a2.getAid());
                    r2.f74190b.add(video);
                }
                List<Video> videoList = awemeRawAd.getVideoList();
                if (videoList != null) {
                    for (T t2 : videoList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            h.a.n.a();
                        }
                        T t3 = t2;
                        if (t3 != null) {
                            t3.setRationAndSourceId(a2.getAid() + i3);
                            r2.f74190b.add(t3);
                        }
                        i2 = i3;
                    }
                }
            }
        } else {
            c.a.a(null);
        }
        com.ss.android.ugc.aweme.ad.feed.a.b S2 = S();
        if (S2 != null) {
            S2.b();
        }
        if (a(w()) != null) {
            this.aU.a(a(w()));
            this.aU.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final void a(Activity activity, Fragment fragment) {
        super.a(activity, fragment);
        if (activity == null) {
            com.ss.android.ugc.aweme.comment.a.e.b("ATTACH ACTIVITY == NULL");
        }
        this.ay = new BroadcastReceiver() {
            /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass24 */

            static {
                Covode.recordClassIndex(58963);
            }

            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && o.this.w != null && o.this.x) {
                    o oVar = o.this;
                    oVar.a(oVar.w, 0);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        LocalBroadcastManager.getInstance(activity).registerReceiver(this.ay, intentFilter);
        if (com.ss.android.ugc.aweme.feed.experiment.b.a()) {
            this.f92897b.bindService(new Intent(this.f92897b, BackgroundAudioBrowserService.class), this.aU, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.e.o.a(boolean, java.lang.String):void");
    }

    public final void b(String str, long j2) {
        this.V = j2;
        int l2 = com.ss.android.ugc.aweme.player.c.l();
        if ((1 != l2 && 2 != l2) || TextUtils.isEmpty(str)) {
            return;
        }
        if (j2 >= 0) {
            this.W.put(str, Long.valueOf(j2));
        } else {
            this.W.remove(str);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, boolean z2) {
        this.f92925l = z2;
        if (1 == com.ss.android.ugc.aweme.player.c.q() && !TextUtils.isEmpty(str)) {
            this.ad.put(str, Boolean.valueOf(z2));
        }
    }

    protected static boolean a(String str, String str2) {
        if (TextUtils.equals(str, "personal_homepage") || TextUtils.equals(str, "others_homepage")) {
            return TextUtils.equals(str2, "output");
        }
        return false;
    }

    public final void a(n nVar) {
        boolean z2;
        int i2;
        d.a.f120589a.a(com.ss.android.ugc.aweme.report.c.PLAYER_RENDER_READY);
        Aweme a2 = a(w());
        Aweme b2 = AwemeService.b().b(nVar.f148789a);
        Aweme aweme = (b2 == null || (a2 != null && TextUtils.equals(b2.getAid(), a2.getAid()))) ? a2 : b2;
        aj a3 = a(nVar.f148789a);
        com.ss.android.ugc.aweme.ad.feed.a.b S2 = S();
        if (S2 == null || !S2.a(aweme)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || a3 == null) {
            this.D = com.ss.android.ugc.aweme.player.e.a();
            this.L = 0;
            this.aF = false;
            com.ss.android.ugc.aweme.commercialize.g.g().a(d(), aweme);
            com.ss.android.ugc.aweme.at.a.a(this.D, aweme);
            com.ss.android.ugc.aweme.at.a.a();
            a.b.f109011a.b("feed_ui_to_video", true);
            a.b.f109011a.a("feed_video_duration", true);
            if (a()) {
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).trackAppsFlyerEvent("video_view", nVar.f148789a);
            }
            al s2 = s();
            if (a3 == null) {
                com.ss.android.ugc.aweme.feed.k.a.a("1", "view holder is null", nVar.f148789a, u(), aweme);
                return;
            }
            if (h()) {
                a3.b();
                if (n()) {
                    if (aweme != null) {
                        if (!TextUtils.isEmpty(this.y)) {
                            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.fe.method.o(this.y, 0, M().n(), aweme.getAid()));
                        }
                        if (s() != null && s().F()) {
                            aweme.getAuthorUid();
                        }
                    }
                    a(nVar.f148789a, true);
                    this.U = true;
                    if (!h()) {
                        com.ss.android.ugc.aweme.feed.k.a.a("3", "view invalid", nVar.f148789a, u(), aweme);
                        return;
                    }
                    a3.p().onRenderReady(nVar);
                    if (a(a3.p())) {
                        this.ax = a3.b().getAid();
                        O();
                    }
                    if (!g.e(a3)) {
                        com.ss.android.ugc.aweme.feed.k.a.a("4", "not video viewholder", nVar.f148789a, u(), aweme);
                        return;
                    }
                    if (a3.b() != null && a3.b().isVr() && ad.f143259a) {
                        ad.f143259a = false;
                        new com.ss.android.ugc.aweme.tux.a.i.a(c()).a(com.ss.android.ugc.aweme.base.utils.h.b(R.string.d67)).a();
                    }
                    if (g.a(a3) && f(a3) != null) {
                        com.ss.android.ugc.aweme.commercialize.g.e().d(a3.b(), d(), f(a3), this.p);
                    }
                    if (!fg.a() || nVar.f148792d <= 0) {
                        b(nVar.f148789a, System.currentTimeMillis());
                    } else {
                        b(nVar.f148789a, nVar.f148792d);
                    }
                    this.aE = com.ss.android.ugc.aweme.m.a.a(2);
                    IAdSceneService f2 = AdSceneServiceImpl.f();
                    if (f2 != null) {
                        f2.c().a(aweme, d(), 1, this.p + 1);
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ad.feed.c.b());
                    }
                    if (this.Y == -1) {
                        this.X = System.currentTimeMillis();
                    } else {
                        this.Y = -1;
                        this.X = System.currentTimeMillis();
                    }
                    this.Z = -1;
                    e(a3);
                    if (aweme != null && aweme.isAd()) {
                        this.av = aweme.getAwemeRawAd().getShowMaskTimes();
                    }
                    this.au = 0;
                    com.ss.android.ugc.aweme.feed.helper.h.a().f93343f = false;
                    com.ss.android.ugc.aweme.feed.helper.h.a().f93342e = 0;
                    a(a3, true, 0);
                    com.ss.android.ugc.aweme.feed.helper.h.a();
                    com.ss.android.ugc.aweme.feed.helper.h.a().f93344g = false;
                    com.ss.android.ugc.aweme.feed.helper.h.a();
                    if (a3.b() != null) {
                        i2 = a3.b().getAwemeType();
                    } else {
                        i2 = 0;
                    }
                    if (gg.f90139a) {
                        t.a(new w(this, nVar, i2, aweme)).b(f.a.h.a.b(f.a.k.a.f158006c)).g();
                    } else {
                        a(nVar.f148789a, i2, aweme);
                    }
                    if (g.c(a3)) {
                        r.onEvent(MobClick.obtain().setEventName("ad_play").setExtValueString(a3.b().getAid()).setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("request_id", u().optString("request_id")).a()));
                    }
                    if (!com.ss.android.ugc.aweme.feed.background.c.a()) {
                        a(nVar, nVar.f148789a);
                    }
                    this.q = b(a3, nVar.f148789a);
                    if (s2 != null) {
                        s2.at();
                    }
                    if (!a3.b().isLive() && s2 != null && s2.aO()) {
                        a3.p().A();
                    }
                    Video video = a3.b().getVideo();
                    if (video != null) {
                        b.i.b(new x(this, video, a3, nVar), r.a());
                        if (nVar.f148790b) {
                            a(video, true);
                        }
                    }
                    this.o.f92885a = 2;
                    a(new j(0, nVar.f148791c));
                    if (this.v) {
                        bm.a(nVar.f148789a);
                    }
                    if (s2 != null) {
                        s2.aA();
                    }
                    a.b.f109011a.b("feed_video_duration", true);
                    a.b.f109011a.a("feed_video_to_total", true);
                    this.aw = false;
                    com.ss.android.ugc.aweme.main.g.a("video_play");
                    r.a("compare_event_and_video", new v(nVar, a2, b2).a());
                    d.a.f120589a.b(com.ss.android.ugc.aweme.report.c.PLAYER_RENDER_READY);
                    return;
                }
            }
            M().B();
            k.a().b();
            com.ss.android.ugc.aweme.feed.k.a.a("2", "view invalid or activity onpause", nVar.f148789a, u(), aweme);
            return;
        }
        a(a3, false, 0);
        onResumePlay(nVar.f148789a);
        S2.a(false);
        h.f.b.l.d("onRenderReady", "");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x025c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final com.ss.android.ugc.playerkit.model.o r22) {
        /*
        // Method dump skipped, instructions count: 620
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.e.o.a(com.ss.android.ugc.playerkit.model.o):void");
    }

    public final void a(com.ss.android.ugc.playerkit.model.o oVar, aj ajVar, long j2, long j3) {
        d.a.f120589a.a(com.ss.android.ugc.aweme.report.c.PLAYER_RENDER_FIRST_DELAY);
        final String id = oVar.getId();
        long j4 = j2 - this.u;
        BuildConfigAllServiceImpl.b();
        if (!this.ba) {
            a.b.f109011a.b("feed_video_to_total", j3, true);
            a.b.f109011a.b("feed_total", j3, true);
            a.b.f109011a.b("feed_texture_available_to_first_frame", j3, false);
            a.b.f109011a.a();
            this.ba = true;
        }
        Q();
        if (ap.c()) {
            com.ss.android.ugc.aweme.ca.d.a();
        }
        String c2 = c(id);
        if (!(ajVar == null || ajVar.b() == null || ajVar.b().getVideo() == null)) {
            new e.a().a(String.valueOf(j4)).a(e()).a(ajVar.b().getVideo()).a(ajVar).c(c2).a(1).b(v()).a(com.ss.android.ugc.aweme.feed.background.c.a()).f114995a.a();
        }
        com.ss.android.ugc.aweme.lego.f.d();
        p.f107614a.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass20 */

            static {
                Covode.recordClassIndex(58959);
            }

            public final void run() {
                String d2;
                String b2;
                String str = id;
                if (!TextUtils.isEmpty(str)) {
                    com.ss.android.ugc.aweme.feed.cache.g.f92722a = true;
                    if (com.ss.android.ugc.aweme.feed.cache.e.f92694f) {
                        d2 = com.ss.android.ugc.aweme.feed.cache.h.e();
                    } else {
                        d2 = com.ss.android.ugc.aweme.feed.cache.h.d();
                    }
                    if (!TextUtils.isEmpty(d2)) {
                        if (d2 == null) {
                            h.f.b.l.b();
                        }
                        if (str == null) {
                            h.f.b.l.b();
                        }
                        if (h.m.p.a((CharSequence) d2, (CharSequence) str, false)) {
                            if (h.m.p.b(d2, str + ',', false)) {
                                b2 = h.m.p.b(d2, str + ',', "", false);
                            } else if (h.m.p.b(d2, str, false)) {
                                b2 = h.m.p.b(d2, str, "", false);
                            } else {
                                b2 = h.m.p.b(d2, ",".concat(String.valueOf(str)), "", false);
                            }
                            if (com.ss.android.ugc.aweme.feed.cache.e.f92694f) {
                                com.ss.android.ugc.aweme.feed.cache.h.b(b2);
                            } else {
                                com.ss.android.ugc.aweme.feed.cache.h.a(b2);
                            }
                        }
                    }
                }
            }
        });
        if (com.ss.android.ugc.aweme.ca.a.a()) {
            Jato.getInnerExecutorService().execute(r.f92972a);
        }
        if (bu.g()) {
            com.ss.android.ugc.aweme.ca.j.b();
        }
        if (s() != null) {
            s().g(id);
        }
        R();
        d.a.f120589a.b(com.ss.android.ugc.aweme.report.c.PLAYER_RENDER_FIRST_DELAY);
    }

    public final void b(Aweme aweme, int i2) {
        Throwable th;
        String str;
        a.b.f109011a.b("feed_ui_to_texture_available", false);
        a.b.f109011a.b("player_perrender_to_texture_availble", false);
        a.b.f109011a.a("feed_texture_available_to_first_frame", false);
        System.currentTimeMillis();
        String str2 = "0";
        try {
            if (!Q && aweme != null && TextUtils.equals(aweme.getAid(), M().f()) && this.u == 0) {
                this.u = SystemClock.elapsedRealtime();
                Q = true;
            }
            al s2 = s();
            if (s2 == null || !s2.bV() || ((Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 22 && (s2.az_() == null || !s2.az_().isResumed())) || (!o() && !n()))) {
                str = "3";
            } else {
                aj w2 = w();
                if (w2 == null) {
                    str = "4";
                } else if (f.f143475a) {
                    M().a(w2.p().x());
                    com.ss.android.ugc.aweme.feed.am.a("7", this.E);
                    com.ss.android.ugc.aweme.feed.am.a(false);
                    return;
                } else if (w2.b() != aweme) {
                    str = "5";
                } else if (aweme.isLive()) {
                    b(w2, aweme);
                    str = "6";
                } else if (!M().b(K())) {
                    M().a(K());
                    if (M().p()) {
                        M().a(w2.p().x());
                        M().x();
                        str = "8";
                    } else if (g.e(w2)) {
                        IAdSceneService f2 = AdSceneServiceImpl.f();
                        if (f2 != null) {
                            f2.c().f(aweme, d());
                        }
                        aa.a(aweme.getAid(), "onTextureAvailable2");
                        str = a(aweme, true, (aj) null);
                        aa.b("tryPlay", str);
                    } else {
                        str = "9";
                    }
                } else {
                    aa.a(aweme.getAid(), "onTextureAvailable");
                    String a2 = a(aweme, i2);
                    al s3 = s();
                    if (s3 != null) {
                        s3.ao();
                    }
                    try {
                        if (!this.bc && (dl.b() || dl.c())) {
                            com.bytedance.monitor.collector.d.f41460d = false;
                            this.bc = true;
                        }
                        if (ap.a() == 1) {
                            com.ss.android.ugc.aweme.ca.d.a();
                        }
                        aa.b("tryResumePlay", a2);
                        a(aweme);
                        str = a2;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = a2;
                        com.ss.android.ugc.aweme.feed.am.a(str2, this.E);
                        com.ss.android.ugc.aweme.feed.am.a(false);
                        throw th;
                    }
                }
            }
            if (p() && a(false) && !M().b(K())) {
                M().a(K());
            }
            com.ss.android.ugc.aweme.feed.am.a(str, this.E);
            com.ss.android.ugc.aweme.feed.am.a(false);
            System.currentTimeMillis();
        } catch (Throwable th3) {
            th = th3;
            com.ss.android.ugc.aweme.feed.am.a(str2, this.E);
            com.ss.android.ugc.aweme.feed.am.a(false);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(int i2, long j2, long j3, Video video) {
        com.ss.android.ugc.aweme.app.f.c a2 = com.ss.android.ugc.aweme.video.util.c.a(new com.ss.android.ugc.aweme.app.f.c().a("count_rate", Float.valueOf((((float) i2) * 1000.0f) / ((float) j2))).a("duration_rate", Long.valueOf(j3 / j2)).a("block_count", Integer.valueOf(i2)).a("block_duration", Long.valueOf(j3))).a("duration", Long.valueOf(j2)).a("video_duration", Integer.valueOf(video != null ? video.getDuration() : 0));
        Context d2 = d();
        if (TextUtils.isEmpty(com.ss.android.ugc.aweme.lancet.j.f107227f) || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107227f = NetworkUtils.getNetworkAccessType(d2);
        }
        com.ss.android.ugc.aweme.app.n.a("aweme_media_block_log1", "video_block", a2.a("netType", com.ss.android.ugc.aweme.lancet.j.f107227f).a());
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        if (r3.getFollowStatus() != 2) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d7, code lost:
        if (r8 == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a(int r18, int r19, int r20, java.lang.String r21, org.json.JSONObject r22, com.ss.android.ugc.aweme.feed.model.Aweme r23, com.ss.android.ugc.aweme.feed.q.al r24, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 519
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.e.o.a(int, int, int, java.lang.String, org.json.JSONObject, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.q.al, java.lang.String):java.lang.Object");
    }

    public final void F() {
        M().B();
    }

    public final void N() {
        onPlayStop(this.E);
    }

    public final long x() {
        return d((Aweme) null);
    }

    private void O() {
        al s2 = s();
        if (s2 != null) {
            s2.l(this.ax);
        }
    }

    private void P() {
        f.a.g.b bVar = this.az;
        if (bVar != null) {
            bVar.dispose();
            this.az = null;
        }
    }

    private boolean U() {
        return TextUtils.equals(this.f92899d, "homepage_hot");
    }

    private boolean V() {
        al s2 = s();
        if (s2 == null) {
            return false;
        }
        return s2.F();
    }

    private void q() {
        WeakReference<al> weakReference = this.S;
        if (weakReference != null && weakReference.get() != null) {
            this.S.get();
        }
    }

    public final void C() {
        al s2 = s();
        if (s2 != null) {
            s2.aZ();
        }
    }

    public final void E() {
        this.f92923a = false;
        this.aj = SystemClock.elapsedRealtime();
        this.Z = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final Aweme I() {
        return a(w());
    }

    /* access modifiers changed from: protected */
    public final i M() {
        if (this.O == null) {
            this.O = com.ss.android.ugc.aweme.video.v.O();
        }
        return this.O;
    }

    /* access modifiers changed from: protected */
    public final al s() {
        return this.S.get();
    }

    public final JSONObject u() {
        al s2 = s();
        if (s2 != null) {
            return s2.an();
        }
        return null;
    }

    public final String v() {
        JSONObject u2 = u();
        if (u2 != null) {
            return u2.optString("request_id");
        }
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.o$25  reason: invalid class name */
    static /* synthetic */ class AnonymousClass25 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f92960a;

        static {
            Covode.recordClassIndex(58964);
            int[] iArr = new int[m.e.values().length];
            f92960a = iArr;
            try {
                iArr[m.e.Ijk.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private void R() {
        if (!com.a.b.c.b(d(), "common_feed_item_feed")) {
            com.ss.android.ugc.aweme.ca.c.a(d(), 1);
        }
    }

    private com.ss.android.ugc.aweme.ad.feed.a.b S() {
        aj w2 = w();
        if (w2 == null || w2.t() == null) {
            return null;
        }
        return w2.t().N();
    }

    public final Aweme A() {
        al s2 = s();
        if (s2 == null) {
            return null;
        }
        return s2.r(a(w()));
    }

    public final OnUIPlayListener K() {
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aw(a(w()))) {
            return r();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.commercialize.feed.c r() {
        if (this.aS == null) {
            this.aS = new com.ss.android.ugc.aweme.commercialize.feed.c(this, new c.b() {
                /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(58976);
                }

                @Override // com.ss.android.ugc.aweme.commercialize.feed.c.b
                public final long a() {
                    return o.this.M().n();
                }

                @Override // com.ss.android.ugc.aweme.commercialize.feed.c.b
                public final long b() {
                    return o.this.M().j();
                }

                @Override // com.ss.android.ugc.aweme.commercialize.feed.c.b
                public final void a(int i2) {
                    if (i2 == 0) {
                        o.this.o.f92885a = 1;
                    } else if (i2 == 1) {
                        o.this.o.f92885a = 2;
                    } else if (i2 == 2) {
                        o.this.o.f92885a = 3;
                    }
                }

                @Override // com.ss.android.ugc.aweme.commercialize.feed.c.b
                public final void a(Video video) {
                    aj w = o.this.w();
                    if (w != null) {
                        o.this.M().a(w.p().x());
                        o.this.M().a(video, null, false, true);
                    }
                }

                @Override // com.ss.android.ugc.aweme.commercialize.feed.c.b
                public final void a(VideoUrlModel videoUrlModel) {
                    com.ss.android.ugc.aweme.video.preload.s.b().f(com.ss.android.ugc.aweme.video.simcommon.a.a(videoUrlModel));
                }
            });
        }
        return this.aS;
    }

    public final Aweme z() {
        al s2 = s();
        if (s2 == null) {
            return null;
        }
        return s2.i(a(w()));
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public String f92965a;

        static {
            Covode.recordClassIndex(58980);
        }

        public final void run() {
            String str;
            Aweme I = o.this.I();
            if (I != null && (str = this.f92965a) != null && str.equals(I.getAid())) {
                if (o.this.M().o()) {
                    o.this.onResumePlay(this.f92965a);
                } else {
                    com.bytedance.aweme.b.a.f25788b.f25790a.post(this);
                }
            }
        }

        private c() {
        }

        /* synthetic */ c(o oVar, byte b2) {
            this();
        }
    }

    private static void Q() {
        boolean z2 = a.b.f109011a.f109003d;
        if (SettingsRequestServiceImpl.i().g() && !com.ss.android.ugc.aweme.feed.cache.e.f92698j) {
            com.ss.android.ugc.aweme.feed.cache.e.f92698j = true;
            if (z2) {
                com.ss.android.ugc.aweme.cw.g.a().execute(new e.d(z2));
            }
        }
    }

    private void T() {
        if (this.Z != -1) {
            long j2 = this.Y;
            if (j2 == -1) {
                this.Y = System.currentTimeMillis() - this.Z;
            } else {
                this.Y = j2 + (System.currentTimeMillis() - this.Z);
            }
            this.Z = -1;
        }
    }

    public final void B() {
        al s2 = s();
        if (s2 != null) {
            if (com.ss.android.ugc.aweme.feed.background.c.a()) {
                com.ss.android.ugc.aweme.feed.helper.a.a(a(w()), s2.a_(true));
            }
            s2.i(com.bytedance.ies.ugc.appcontext.f.f34637l);
        }
    }

    public final void J() {
        long currentTimeMillis = System.currentTimeMillis() - this.V;
        r.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName(this.f92899d).setExtValueLong(currentTimeMillis));
        com.ss.android.ugc.aweme.metrics.am amVar = new com.ss.android.ugc.aweme.metrics.am();
        amVar.f109498a = String.valueOf(currentTimeMillis);
        amVar.a(this.f92899d).o(this.f92902g).f();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        Activity c2 = c();
        if ((!(c2 instanceof com.ss.android.ugc.aweme.main.j) || !((com.ss.android.ugc.aweme.main.j) c2).isDuoDualMode()) && c2 != null && !ScrollSwitchStateManager.a.a((androidx.fragment.app.e) c2).b("page_feed")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final aj w() {
        aj aC2;
        aj U2;
        al s2 = s();
        if (s2 == null || (aC2 = s2.aC()) == null) {
            return null;
        }
        if (aC2.a() != 40 || aC2.b().getUserStory() == null || (U2 = aC2.U()) == null) {
            return aC2;
        }
        return U2;
    }

    public final void y() {
        aj w2;
        Aweme b2;
        User author;
        if (k() && TextUtils.equals(this.f92899d, "toplist_friend") && (w2 = w()) != null && (b2 = w2.b()) != null && (author = b2.getAuthor()) != null) {
            a(author);
        }
    }

    public final void G() {
        this.bj = null;
        this.bk = null;
        this.bm = null;
        this.bl = null;
        if (this.bb) {
            this.bb = false;
            aj w2 = w();
            if (g.e(w2) && !TextUtils.equals(this.f92899d, "general_search")) {
                Aweme b2 = w2.b();
                IAdSceneService f2 = AdSceneServiceImpl.f();
                if (b2 != null && f2 != null && !this.aF && b2.getAid() != null) {
                    T();
                    f2.c().a(b2, d(), b2.getAid(), H(), this.p + 1);
                }
            }
        }
    }

    public final long H() {
        long currentTimeMillis;
        long j2;
        long n2;
        if (com.ss.android.ugc.aweme.feed.experiment.n.f93080a == 1) {
            com.ss.android.ugc.aweme.ad.feed.b.e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(a(w())) && a2 != null) {
                n2 = a2.f();
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.aw(a(w()))) {
                n2 = r().d();
            } else {
                n2 = M().n();
            }
            if (n2 > 0) {
                return n2;
            }
        }
        if (this.Y == -1) {
            currentTimeMillis = System.currentTimeMillis();
            j2 = this.X;
        } else {
            currentTimeMillis = System.currentTimeMillis() - this.X;
            j2 = this.Y;
        }
        return currentTimeMillis - j2;
    }

    public final void L() {
        if (com.ss.android.ugc.aweme.feed.experiment.a.a()) {
            Aweme a2 = a(w());
            Aweme aweme = this.bh;
            if (!(aweme == null || a2 == null || TextUtils.equals(aweme.getAid(), a2.getAid()))) {
                aj a3 = a(this.bh.getAid());
                if (g.a(a3) && f(a3) != null) {
                    com.ss.android.ugc.aweme.commercialize.g.e().a(d(), a3.b(), f(a3), false);
                }
            }
        }
        this.bf = -1;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final Context d() {
        al s2 = s();
        if (s2 == null || s2.ay_() == null) {
            return super.d();
        }
        return s2.ay_();
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final void b() {
        super.b();
        Context d2 = d();
        LocalBroadcastManager.getInstance(d2).unregisterReceiver(this.ay);
        P();
        if (com.ss.android.ugc.aweme.feed.experiment.b.a() && d2 != null) {
            d2.unbindService(this.aU);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z2) {
        a(z2, false);
    }

    /* access modifiers changed from: package-private */
    public static class e implements com.ss.android.ugc.aweme.player.sdk.api.m {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<o> f92969a;

        static {
            Covode.recordClassIndex(58982);
        }

        public e(o oVar) {
            this.f92969a = new WeakReference<>(oVar);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.m
        public final void a(String str, int i2, int i3, int i4, String str2, boolean z, boolean z2, long j2, long j3, long j4) {
            aj a2;
            int i5;
            List<CaptionItemModel> captionList;
            long j5 = j3;
            o oVar = this.f92969a.get();
            if (oVar != null && (a2 = oVar.a(str)) != null) {
                Aweme a3 = o.a(a2);
                a2.a(str, i2, i4, str2);
                if (z || z2) {
                    long n = oVar.M().n();
                    if (n > j4) {
                        i5 = 0;
                    } else if (n == j4) {
                        i5 = 1;
                    } else if (!str.equals(a3.getAid())) {
                        i5 = 2;
                    } else {
                        i5 = 3;
                    }
                    long j6 = n - j4;
                    if (i2 == -1) {
                        j5 = -1;
                    }
                    if (z) {
                        a2.a(i2, oVar.c(str), j2, j5, i5, n, j4, j6, oVar.B);
                    } else if (z2) {
                        if (!(a2.b().getVideo().getCaptionModel() == null || a2.b().getVideo().getCaptionModel().getCaptionList() == null || a2.b().getVideo().getCaptionModel().getCaptionList().isEmpty() || (captionList = a2.b().getVideo().getCaptionModel().getCaptionList()) == null || captionList.isEmpty())) {
                            for (CaptionItemModel captionItemModel : captionList) {
                                if (i3 == ((int) captionItemModel.getLanguageId())) {
                                    VideoUrlModel a4 = com.ss.android.ugc.aweme.video.simcommon.a.a(captionItemModel);
                                    oVar.B = o.a(a4.getSourceId(), a4);
                                    if (oVar.B < 0) {
                                        oVar.B = 0;
                                    }
                                }
                            }
                        }
                        a2.a(i2, j2, j5, i5, n, j4, j6, oVar.B);
                    }
                }
            }
        }
    }

    public static Aweme a(aj ajVar) {
        if (ajVar != null) {
            return ajVar.b();
        }
        return null;
    }

    protected static String c(aj ajVar) {
        return ajVar.P().getAid();
    }

    private static boolean d(aj ajVar) {
        if (ajVar.p().s() == 2) {
            return true;
        }
        return false;
    }

    private static com.ss.android.ugc.aweme.video.f.a g(aj ajVar) {
        return ajVar.p().O();
    }

    private static boolean h(aj ajVar) {
        if (ajVar == null || ajVar.b() == null) {
            return false;
        }
        return true;
    }

    public final void b(boolean z2) {
        M().a(z2);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z2) {
        if (com.ss.android.ugc.aweme.player.c.q() == 0) {
            b("", z2);
        }
    }

    private static View f(aj ajVar) {
        if (ajVar == null || ajVar.v() == null || ajVar.v().ad() == null) {
            return null;
        }
        return ajVar.v().ad();
    }

    private void g(final Aweme aweme) {
        aweme.getAid();
        if (aweme.getPreload() != null) {
            b.i.b(new Callable<Object>() {
                /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass22 */

                static {
                    Covode.recordClassIndex(58961);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Aweme aweme = aweme;
                    String str = o.this.f92899d;
                    if (aweme.getPreload().commentPreload >= 0) {
                        com.ss.android.ugc.aweme.ct.d.a().a(new com.ss.android.ugc.aweme.ct.f(aweme, aweme.getPreload().commentPreload * 1000, str, c.a.COMMENT));
                    }
                    Aweme aweme2 = aweme;
                    if (aweme2.getPreload().profilePreload < 0) {
                        return null;
                    }
                    com.ss.android.ugc.aweme.ct.d.a().a(new com.ss.android.ugc.aweme.ct.f(aweme2, aweme2.getPreload().profilePreload, "", c.a.PROFILE));
                    com.ss.android.ugc.aweme.ct.d.a().a(new com.ss.android.ugc.aweme.ct.f(aweme2, aweme2.getPreload().profilePreload, "", c.a.POST));
                    return null;
                }
            }, b.i.f4824a);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayPause(String str) {
        if (this.F.a(str)) {
            c(str);
            this.aU.a();
        }
    }

    private long e(String str) {
        if (com.ss.android.ugc.aweme.player.c.q() == 0) {
            return this.ak;
        }
        if (1 != com.ss.android.ugc.aweme.player.c.q() || TextUtils.isEmpty(str)) {
            return -1;
        }
        if (!this.ae.containsKey(str)) {
            return this.ak;
        }
        return this.ae.get(str).longValue();
    }

    private long f(String str) {
        if (com.ss.android.ugc.aweme.player.c.q() == 0) {
            return this.ar;
        }
        if (1 != com.ss.android.ugc.aweme.player.c.q() || TextUtils.isEmpty(str)) {
            return -1;
        }
        if (!this.ag.containsKey(str)) {
            return this.ar;
        }
        return this.ag.get(str).longValue();
    }

    private long g(String str) {
        if (com.ss.android.ugc.aweme.player.c.q() == 0) {
            return this.at;
        }
        if (1 != com.ss.android.ugc.aweme.player.c.q() || TextUtils.isEmpty(str)) {
            return -1;
        }
        if (!this.af.containsKey(str)) {
            return this.at;
        }
        return this.af.get(str).longValue();
    }

    private boolean h(String str) {
        if (com.ss.android.ugc.aweme.player.c.q() == 0) {
            return this.ap;
        }
        if (1 != com.ss.android.ugc.aweme.player.c.q() || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!this.ab.containsKey(str)) {
            return this.ap;
        }
        return this.ab.get(str).booleanValue();
    }

    private boolean i(String str) {
        if (com.ss.android.ugc.aweme.player.c.q() == 0) {
            return this.aa;
        }
        if (1 != com.ss.android.ugc.aweme.player.c.q() || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!this.ac.containsKey(str)) {
            return this.aa;
        }
        return this.ac.get(str).booleanValue();
    }

    private boolean j(String str) {
        if (com.ss.android.ugc.aweme.player.c.q() == 0) {
            return this.f92925l;
        }
        if (1 != com.ss.android.ugc.aweme.player.c.q() || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!this.ad.containsKey(str)) {
            return this.f92925l;
        }
        return this.ad.get(str).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(final com.ss.android.ugc.playerkit.model.o oVar) {
        com.ss.android.ugc.aweme.feed.k.f93535i = false;
        long j2 = cq.f89713a;
        if (j2 > 0) {
            com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass16 */

                static {
                    Covode.recordClassIndex(58954);
                }

                public final void run() {
                    o.this.a(oVar);
                }
            }, j2);
        } else if (!de.f89779e || !fr.f142950d) {
            a(oVar);
        } else {
            com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass17 */

                static {
                    Covode.recordClassIndex(58955);
                }

                public final void run() {
                    o.this.a(oVar);
                }
            }, 16);
        }
    }

    private static boolean c(Aweme aweme) {
        if (aweme == null || !aweme.isCanPlay()) {
            return false;
        }
        return true;
    }

    private long d(Aweme aweme) {
        Video video;
        int duration;
        com.ss.android.ugc.aweme.ad.feed.b.e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(a(w())) && a2 != null) {
            return a2.g();
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aw(aweme)) {
            return r().c();
        }
        if ((aweme != null || (aweme = a(w())) != null) && (video = aweme.getVideo()) != null && (duration = video.getDuration()) > 0) {
            return (long) duration;
        }
        long j2 = M().j();
        if (j2 > 0) {
            return j2;
        }
        if (this.X <= 0) {
            return -1;
        }
        if (this.Y != -1) {
            return (System.currentTimeMillis() - this.X) - this.Y;
        }
        return System.currentTimeMillis() - this.X;
    }

    private void e(aj ajVar) {
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aO(a(w())) || com.ss.android.ugc.aweme.commercialize.e.a.b.x(a(w()))) {
            ajVar.t().s();
        }
    }

    private static boolean f(Aweme aweme) {
        if (aweme == null || aweme.getMusic() == null || aweme.getMusic().getId() == 0 || aweme.getMusic().getMusicStatus() != 0 || com.ss.android.ugc.aweme.commercialize.g.h().a(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(l lVar) {
        com.ss.android.ugc.playerkit.session.b c2;
        Session c3 = com.ss.android.ugc.playerkit.session.a.f148854a.c(lVar.f148746a);
        if (!TextUtils.isEmpty(lVar.f148746a)) {
            this.aL.put(lVar.f148746a, Integer.valueOf(lVar.f148749d));
        }
        if (!(c3 == null || (c2 = com.ss.android.ugc.playerkit.videoview.c.a.f148919a.c(c3.key)) == null)) {
            c2.f148865e = true;
        }
        aj a2 = a(lVar.f148746a);
        a(lVar, a2);
        if (a2 != null) {
            M().J();
        }
        if (this.v) {
            String str = lVar.f148746a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("source_id", str);
            } catch (JSONException unused) {
            }
            com.bytedance.apm.b.a("aweme_screen_ad_open_media_error_rate", 1, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlaying(String str) {
        String aid;
        Handler handler;
        Message obtainMessage;
        this.F.a(c(str), str);
        this.aU.a();
        com.ss.android.ugc.aweme.video.simpreloader.m a2 = m.a.a();
        Aweme a3 = a(w());
        if (com.ss.android.ugc.aweme.video.simpreloader.m.f143982d.f143601a && com.ss.android.ugc.aweme.video.simpreloader.m.f143982d.f143602b && a3 != null && (aid = a3.getAid()) != null && aid.length() != 0 && (handler = a2.f143985b) != null && (obtainMessage = handler.obtainMessage(5, a3)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderReady(final n nVar) {
        int a2;
        MethodCollector.i(8477);
        if (fq.a.f142946a.a(fp.ON_RENDER_READY) && (a2 = com.bytedance.ies.abmock.b.a().a(true, "downgrade_feed_total_duration", 0)) > 0) {
            try {
                Thread.sleep((long) a2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = cq.f89713a;
        if (j2 > 0) {
            i iVar = this.O;
            if (iVar != null) {
                iVar.B();
            }
            com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(58948);
                }

                public final void run() {
                    if (o.this.O != null) {
                        o.this.O.y();
                    }
                    o.this.a(nVar);
                }
            }, j2);
            MethodCollector.o(8477);
        } else if (!de.f89778d || !fr.f142950d) {
            a(nVar);
            MethodCollector.o(8477);
        } else {
            com.bytedance.aweme.b.a.f25788b.f25790a.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.e.o.AnonymousClass11 */

                static {
                    Covode.recordClassIndex(58949);
                }

                public final void run() {
                    o.this.a(nVar);
                }
            });
            MethodCollector.o(8477);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r1 = r2.b().getVideo();
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRetryOnError(final com.ss.android.ugc.playerkit.model.l r4) {
        /*
            r3 = this;
            boolean r0 = r3.h()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = r4.f148746a
            com.ss.android.ugc.aweme.feed.adapter.aj r2 = r3.a(r0)
            if (r2 != 0) goto L_0x0010
            return
        L_0x0010:
            com.ss.android.ugc.aweme.feed.adapter.ah r0 = r2.p()
            r0.onRetryOnError(r4)
            int[] r1 = com.ss.android.ugc.aweme.feed.e.o.AnonymousClass25.f92960a
            com.ss.android.ugc.aweme.video.i r0 = r3.M()
            com.ss.android.ugc.playerkit.model.m$e r0 = r0.a()
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x002b
        L_0x002a:
            return
        L_0x002b:
            java.lang.Object r0 = r4.f148751f
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r4.f148751f
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x002a
        L_0x0035:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.b()
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.b()
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
            if (r1 != 0) goto L_0x0046
            return
        L_0x0046:
            com.ss.android.ugc.aweme.feed.e.o$21 r0 = new com.ss.android.ugc.aweme.feed.e.o$21
            r0.<init>(r4, r1)
            com.ss.android.b.a.a.a.a(r0)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.e.o.onRetryOnError(com.ss.android.ugc.playerkit.model.l):void");
    }

    private void e(Aweme aweme) {
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme)) {
            int i2 = this.N;
            if (i2 >= 100 && i2 <= 1000 && d(aweme) > 29000) {
                long d2 = d(aweme) / ((long) this.N);
                if (d2 > 50) {
                    M().a((int) d2);
                    return;
                }
            }
            M().I();
        }
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        String str2;
        if (str != null) {
            str2 = this.aR.get(str);
        } else {
            str2 = "";
        }
        return String.valueOf(str2);
    }

    public final long d(String str) {
        int l2 = com.ss.android.ugc.aweme.player.c.l();
        if (l2 == 0) {
            return this.V;
        }
        if (1 != l2) {
            if (2 != l2) {
                return -1;
            }
            if (!TextUtils.isEmpty(str) && !this.W.containsKey(str) && this.V > 0) {
                com.bytedance.c.a.a.a.b.a(new Exception(), "getPlayStartTime exception which may lead to playtime metric over actually value!");
            }
        }
        if (TextUtils.isEmpty(str) || !this.W.containsKey(str)) {
            return -1;
        }
        return this.W.get(str).longValue();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
        Aweme aweme;
        d.a.f120589a.a(com.ss.android.ugc.aweme.report.c.PLAYER_PAUSE);
        com.ss.android.ugc.aweme.at.a.a("true");
        com.ss.android.ugc.aweme.at.a.b("true");
        long currentTimeMillis = System.currentTimeMillis();
        if (d() != null) {
            UgAllServiceImpl.c();
            aj w2 = w();
            aj a2 = a(str);
            Aweme aweme2 = null;
            if (w2 != null) {
                aweme = w2.b();
            } else {
                aweme = null;
            }
            if (a2 != null) {
                aweme2 = a2.b();
            }
            a(str, currentTimeMillis);
            this.o.f92885a = 3;
            if (w2 != null) {
                w2.p().onPausePlay(str);
                M().J();
            }
            if (aweme != null && !TextUtils.isEmpty(this.y)) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.fe.method.o(this.y, 1, M().n(), str));
            }
            j jVar = new j(4);
            jVar.f128599f = str;
            a(jVar);
            this.Z = currentTimeMillis;
            boolean z2 = false;
            this.aC = false;
            SpecActServiceImpl.i().f();
            SpecActServiceImpl.i().a().b();
            this.aU.a();
            IMLCommonService instance = MLCommonService.instance();
            String str2 = this.f92899d;
            if (s() != null && !s().aO()) {
                z2 = true;
            }
            instance.onPlayPause(aweme2, str2, z2);
            d.a.f120589a.b(com.ss.android.ugc.aweme.report.c.PLAYER_PAUSE);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompletedFirstTime(String str) {
        Aweme aweme;
        if (h()) {
            com.ss.android.ugc.aweme.at.a.a("true");
            com.ss.android.ugc.aweme.at.a.b("true");
            al s2 = s();
            aj a2 = a(str);
            if (a2 != null) {
                a2.p().onPlayCompletedFirstTime(str);
            }
            a(new j(6));
            if (a2 != null) {
                aweme = a2.b();
                if (aweme != null && !TextUtils.isEmpty(this.y)) {
                    com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.fe.method.o(this.y, 3, M().n(), aweme.getAid()));
                }
            } else {
                aweme = null;
            }
            com.ss.android.ugc.aweme.discover.hitrank.d.f81205b.a(aweme, 1);
            a(str, s2, aweme);
            IUgAllService c2 = UgAllServiceImpl.c();
            U();
            c2.a();
            MLCommonService.instance().onPlayFinishFirst(aweme, this.f92899d);
            if (a(w()) != null && U()) {
                a.C2958a.a().f115770d = true;
                a.C2958a.a().a();
                a.C2958a.a().a(2);
            }
        }
    }

    private static boolean b(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null) {
            return false;
        }
        return aweme.getStatus().isDelete();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b3, code lost:
        if (r4 != null) goto L_0x01d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0216  */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPlayCompleted(java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 668
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.e.o.onPlayCompleted(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0278, code lost:
        if (r9 != null) goto L_0x0174;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPreparePlay(java.lang.String r26) {
        /*
        // Method dump skipped, instructions count: 795
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.e.o.onPreparePlay(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x020d, code lost:
        if (r9 != null) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x021c, code lost:
        if (r4 == null) goto L_0x0179;
     */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResumePlay(java.lang.String r21) {
        /*
        // Method dump skipped, instructions count: 550
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.e.o.onResumePlay(java.lang.String):void");
    }

    public static com.ss.android.ugc.aweme.video.c.c b(Video video, boolean z2) {
        return com.ss.android.ugc.aweme.video.util.d.a(video, z2);
    }

    /* access modifiers changed from: package-private */
    public class d implements com.ss.android.ugc.aweme.player.sdk.api.a {

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<o> f92968b;

        static {
            Covode.recordClassIndex(58981);
        }

        public d(o oVar) {
            this.f92968b = new WeakReference<>(oVar);
        }

        @Override // com.ss.android.ugc.aweme.player.sdk.api.a
        public final void a(String str, long j2, int i2, String str2) {
            List<TtsInfos> ttsInfos;
            o oVar = this.f92968b.get();
            if (oVar != null) {
                oVar.f92926m.put(str, true);
                aj a2 = oVar.a(str);
                if (a2 != null) {
                    boolean a3 = com.ss.android.ugc.aweme.video.util.d.a(a2.b());
                    boolean containsKey = o.this.n.containsKey(str);
                    int i3 = 0;
                    if (!a3 || a2.b() == null || a2.b().getAudio() == null || a2.b().getAudio().getTtsInfos() == null || a2.b().getAudio().getTtsInfos().isEmpty() || (ttsInfos = a2.b().getAudio().getTtsInfos()) == null || ttsInfos.isEmpty()) {
                        i3 = 0;
                    } else {
                        for (TtsInfos ttsInfos2 : ttsInfos) {
                            if (ttsInfos2.getPlayAddress().getUrlKey() != null && !TextUtils.isEmpty(str2) && str2.equals(ttsInfos2.getPlayAddress().getUrlKey())) {
                                VideoUrlModel a4 = com.ss.android.ugc.aweme.video.simcommon.a.a(ttsInfos2);
                                i3 = o.a(a4.getSourceId(), a4);
                            }
                        }
                    }
                    a2.a(str, containsKey ? 1 : 0, i3, i2, j2);
                }
            }
        }
    }

    public static int a(String str, VideoUrlModel videoUrlModel) {
        if (ac.a(videoUrlModel)) {
            return ac.b(videoUrlModel);
        }
        if (PreloadSessionManager.f143503a.b(str) == null) {
            return -2;
        }
        return -1;
    }

    private static String b(aj ajVar, String str) {
        if (ajVar == null || !TextUtils.equals(com.ss.android.ugc.aweme.metrics.ac.e(ajVar.b()), str)) {
            return "";
        }
        return com.ss.android.ugc.aweme.metrics.ac.a(ajVar.b());
    }

    private void c(String str, long j2) {
        this.ak = j2;
        if (1 == com.ss.android.ugc.aweme.player.c.q() && !TextUtils.isEmpty(str)) {
            this.ae.put(str, Long.valueOf(j2));
        }
    }

    private void d(String str, long j2) {
        this.ar = j2;
        if (1 == com.ss.android.ugc.aweme.player.c.q() && !TextUtils.isEmpty(str)) {
            this.ag.put(str, Long.valueOf(j2));
        }
    }

    private void e(String str, long j2) {
        this.at = j2;
        if (1 == com.ss.android.ugc.aweme.player.c.q() && !TextUtils.isEmpty(str)) {
            this.af.put(str, Long.valueOf(j2));
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(String str, boolean z2) {
        if (1 == com.ss.android.ugc.aweme.player.c.q() && TextUtils.equals(this.E, str)) {
            b(str, z2);
        }
    }

    private void a(Aweme aweme, bd bdVar) {
        if (bdVar != null && bdVar.e()) {
            bdVar.g();
            IAdSceneService f2 = AdSceneServiceImpl.f();
            if (f2 != null) {
                f2.c().a(aweme, d(), 1, this.p + 1);
            }
        }
    }

    private void b(aj ajVar, Aweme aweme) {
        if (ajVar != null && aweme != null) {
            if (!com.ss.android.ugc.aweme.feed.experiment.ah.a(this.f92899d)) {
                F();
            }
            ah p2 = ajVar.p();
            if (p2.s() == 2) {
                p2.b(aweme);
            }
        }
    }

    private void c(String str, boolean z2) {
        this.ap = z2;
        if (1 == com.ss.android.ugc.aweme.player.c.q() && !TextUtils.isEmpty(str)) {
            this.ab.put(str, Boolean.valueOf(z2));
        }
    }

    private void d(String str, boolean z2) {
        this.aa = z2;
        if (1 == com.ss.android.ugc.aweme.player.c.q() && !TextUtils.isEmpty(str)) {
            this.ac.put(str, Boolean.valueOf(z2));
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8951);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(8951);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static void b(Aweme aweme, al alVar) {
        if (aweme != null && SmartFeedPreloadService.instance().enable() && SmartPreloadExperiment.a.f110342i == 0) {
            boolean z2 = false;
            if (SmartPreloadExperiment.a.f110339f && alVar != null && !alVar.aO()) {
                z2 = true;
            }
            if (SmartFeedPreloadService.getDebug()) {
                if (alVar != null && (alVar instanceof com.ss.android.ugc.aweme.feed.q.a)) {
                    alVar.i();
                }
                aweme.getAid();
            }
            if (!z2) {
                SmartFeedPreloadService.instance().startSmartPreloadV2Judge(aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onCompleteLoaded(String str, boolean z2) {
        Handler handler;
        Message obtainMessage;
        if (U()) {
            a.C2958a.a().a();
            a.C2958a.a().a(1);
        }
        al s2 = s();
        if (s2 != null) {
            s2.b(str, z2);
        }
        com.ss.android.ugc.aweme.video.simpreloader.m a2 = m.a.a();
        if (com.ss.android.ugc.aweme.video.simpreloader.m.f143982d.f143601a && com.ss.android.ugc.aweme.video.simpreloader.m.f143982d.f143602b && str != null && str.length() != 0 && (handler = a2.f143985b) != null && (obtainMessage = handler.obtainMessage(3, str)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    private void b(String str, boolean z2) {
        aj w2 = w();
        if (w2 != null) {
            w2.p().onBuffering(z2);
        }
        c(str, z2);
        a(str, z2, false);
        if (w2 != null && f(w2) != null && j(str) && g.a(w2)) {
            if (z2) {
                com.ss.android.ugc.aweme.commercialize.g.e().b(w2.b(), d(), f(w2), this.p);
            } else {
                com.ss.android.ugc.aweme.commercialize.g.e().c(w2.b(), d(), f(w2), this.p);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayStop(String str, JSONObject jSONObject) {
        Aweme b2;
        aj a2;
        Aweme b3;
        long j2;
        long j3;
        int i2;
        long j4;
        boolean z2;
        VideoUrlModel playAddr;
        List<Long> list;
        d.a.f120589a.a(com.ss.android.ugc.aweme.report.c.PLAYER_STOP);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String c2 = c(str);
        if (!TextUtils.isEmpty(c2)) {
            if (this.F.a(str) || TextUtils.equals(str, this.P)) {
                if (!TextUtils.equals(this.aG, str)) {
                    this.F.f92921b.remove(str);
                    this.aU.a();
                    aj w2 = w();
                    if (w2 != null && (b2 = w2.b()) != null && !TextUtils.isEmpty(b2.getAid()) && (a2 = a(str)) != null && (b3 = a2.b()) != null) {
                        if (this.aJ.containsKey(str)) {
                            if (this.aM.containsKey(str)) {
                                j2 = this.aM.get(str).longValue();
                            } else {
                                j2 = this.aN;
                            }
                        } else if (this.aK.containsKey(str)) {
                            j2 = elapsedRealtime - this.aK.get(str).longValue();
                        } else {
                            j2 = 0;
                        }
                        Video video = b3.getVideo();
                        float j5 = (float) M().j();
                        ArrayList<Aweme> arrayList = new ArrayList<>();
                        al s2 = s();
                        if (s2 != null) {
                            int aE2 = s2.aE() + 1;
                            while (aE2 > 0 && aE2 < s2.aF() && arrayList.size() <= com.ss.android.ugc.aweme.player.a.b.Y) {
                                Aweme f2 = s2.f(aE2);
                                if (f2 == null || f2.getVideo() == null || f2.getVideo().getPlayAddr() == null) {
                                    break;
                                }
                                arrayList.add(f2);
                                aE2++;
                            }
                        }
                        JSONObject jSONObject2 = null;
                        if (!this.aT.containsKey(str) || (list = this.aT.get(str)) == null || list.size() <= 0) {
                            j3 = 0;
                        } else {
                            j3 = 0;
                            for (Long l2 : list) {
                                j3 += l2.longValue();
                            }
                        }
                        boolean containsKey = this.f92926m.containsKey(str);
                        com.ss.android.ugc.aweme.feed.param.b a3 = FeedParamProvider.a.a(d());
                        if (jSONObject != null) {
                            z2 = jSONObject.optBoolean("is_super_resolution");
                            jSONObject2 = jSONObject.optJSONObject("hw_codec_info");
                            j4 = jSONObject.optLong("audio_bitrate");
                            i2 = jSONObject.optInt("audio_codec_format");
                        } else {
                            i2 = 0;
                            j4 = 0;
                            z2 = false;
                        }
                        Context a4 = com.bytedance.ies.ugc.appcontext.d.a();
                        double d2 = 0.0d;
                        Double d3 = this.aI.get(b3.getAid());
                        if (!(b3.getAid() == null || d3 == null)) {
                            d2 = com.ss.android.ugc.aweme.m.a.a(2) - d3.doubleValue();
                        }
                        b.a aVar = new b.a();
                        aVar.f114929a.f114916a = b3;
                        aVar.f114929a.f114917b = Integer.valueOf(this.f92900e);
                        aVar.f114929a.f114919d = h(str);
                        aVar.f114929a.f114928m = this.D;
                        aVar.f114929a.s = this.al;
                        aVar.f114929a.t = this.ah;
                        aVar.f114929a.r = j2;
                        aVar.f114929a.o = arrayList;
                        aVar.f114929a.v = c2;
                        aVar.f114929a.f114921f = z2;
                        aVar.f114929a.G = containsKey ? 1 : 0;
                        aVar.f114929a.I = jSONObject2;
                        aVar.f114929a.J = i2;
                        aVar.f114929a.K = (int) j4;
                        aVar.f114929a.N = com.ss.android.ugc.aweme.m.a.c(a4);
                        aVar.f114929a.L = (float) com.ss.android.ugc.aweme.m.a.a(2);
                        aVar.f114929a.M = (float) d2;
                        aVar.f114929a.F = com.ss.android.ugc.aweme.feed.background.c.a();
                        aVar.f114929a.f114920e = com.ss.android.ugc.aweme.video.preload.s.b().f();
                        if (!(a3 == null || a3.getNewsId() == null)) {
                            String newsId = a3.getNewsId();
                            h.f.b.l.d(newsId, "");
                            aVar.f114929a.H = newsId;
                        }
                        if (video != null) {
                            this.aG = str;
                            aVar.f114929a.q = this.aJ.containsKey(str) ? 1 : 0;
                            VideoUrlModel playAddr2 = video.getPlayAddr();
                            if (playAddr2 != null) {
                                if (j5 <= 0.0f) {
                                    j5 = (float) playAddr2.getDuration();
                                }
                                List<com.ss.android.ugc.playerkit.model.v> l3 = com.ss.android.ugc.aweme.video.preload.s.b().l(com.ss.android.ugc.aweme.video.simcommon.a.a(playAddr2));
                                List<x> k2 = com.ss.android.ugc.aweme.video.preload.s.b().k(com.ss.android.ugc.aweme.video.simcommon.a.a(playAddr2));
                                aVar.f114929a.f114918c = playAddr2.isBytevc1();
                                aVar.f114929a.f114923h = k2;
                                aVar.f114929a.f114925j = j5;
                                aVar.f114929a.f114926k = j3;
                                if (l3 != null) {
                                    aVar.f114929a.f114922g = l3;
                                } else {
                                    aVar.a(com.ss.android.ugc.aweme.player.a.b.O);
                                }
                            } else {
                                aVar.a(com.ss.android.ugc.aweme.player.a.b.P);
                            }
                        } else {
                            aVar.a(com.ss.android.ugc.aweme.player.a.b.Q);
                        }
                        if (s2 != null) {
                            String a_ = s2.a_(true);
                            h.f.b.l.d(a_, "");
                            aVar.f114929a.w = a_;
                        }
                        if (!(video == null || (playAddr = video.getPlayAddr()) == null)) {
                            aVar.f114929a.f114927l = (long) ac.b(playAddr);
                        }
                        com.ss.android.ugc.aweme.video.simplayer.c.a aVar2 = new com.ss.android.ugc.aweme.video.simplayer.c.a();
                        if (M().L() != null) {
                            M().L().a(str);
                            aVar2 = M().L().a(str);
                        }
                        com.ss.android.ugc.aweme.video.simplayer.c.b bVar = new com.ss.android.ugc.aweme.video.simplayer.c.b();
                        if (M().L() != null) {
                            M().L().b(str);
                            bVar = M().L().b(str);
                        }
                        aVar.f114929a.x = aVar2.f143857a;
                        aVar.f114929a.y = aVar2.f143858b;
                        aVar.f114929a.z = aVar2.f143859c;
                        aVar.f114929a.A = aVar2.f143860d;
                        aVar.f114929a.B = aVar2.f143861e;
                        aVar.f114929a.C = aVar2.f143862f;
                        aVar.f114929a.D = aVar2.f143863g;
                        aVar.f114929a.E = bVar;
                        com.ss.android.ugc.aweme.player.a.b bVar2 = aVar.f114929a;
                        if (bVar2.f114924i == 0 && (this.aL.get(str) instanceof Integer)) {
                            bVar2.f114924i = this.aL.get(str).intValue();
                        }
                        if (!com.ss.android.ugc.aweme.feed.background.c.a()) {
                            z.e eVar = new z.e();
                            eVar.element = (T) SmartFeedPreloadService.b.f110387a.getPredictLabelResult();
                            b.i.b(new b.e(bVar2, eVar), r.a());
                        }
                        MLCommonService.instance().onPlayStop(str, a(w()), this.f92899d);
                    } else {
                        return;
                    }
                }
                this.P = "";
                d.a.f120589a.b(com.ss.android.ugc.aweme.report.c.PLAYER_STOP);
            }
        }
    }

    private static void a(Aweme aweme, al alVar) {
        if (aweme != null && SmartFeedAdUIService.instance().enable()) {
            boolean z2 = false;
            if (alVar != null && !alVar.aO()) {
                z2 = true;
            }
            if (SmartFeedAdUIService.getDebug()) {
                if (alVar != null && (alVar instanceof com.ss.android.ugc.aweme.feed.q.a)) {
                    alVar.i();
                }
                aweme.getAid();
            }
            if (!z2) {
                SmartFeedAdUIService.instance().startSmartAdUIJudge(aweme);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        String f92962a;

        /* renamed from: b  reason: collision with root package name */
        int f92963b;

        static {
            Covode.recordClassIndex(58979);
        }

        b(String str, int i2) {
            this.f92962a = str;
            this.f92963b = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBufferedPercent(String str, long j2, int i2) {
        int a2;
        Aweme a3 = a(w());
        if (U() && i2 == 100 && a3 != null && TextUtils.equals(str, a3.getAid())) {
            a.C2958a.a().a();
            a.C2958a.a().a(1);
        }
        al s2 = s();
        if (com.ss.android.ugc.aweme.player.c.c()) {
            if (com.ss.android.ugc.aweme.player.a.f114913a) {
                a2 = ((Number) com.ss.android.ugc.aweme.player.c.f115057f.getValue()).intValue();
            } else {
                a2 = com.bytedance.ies.abmock.b.a().a(true, "player_prerender_buffered_percent", 90);
            }
            if (i2 >= a2 && s2 != null && !s2.bb()) {
                this.bd = -1;
                a(0, false, com.ss.android.ugc.aweme.player.c.e());
            }
        }
    }

    public o(String str, int i2, al alVar) {
        super(str, i2);
        this.S = new WeakReference<>(alVar);
        this.V = -1;
        this.W = new HashMap();
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aE = 0.0d;
        try {
            this.N = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getVideoPlayProgressCount().intValue();
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
        }
        this.J = com.bytedance.ies.abmock.b.a().a(true, "player_ab_block_type", 0);
    }

    private void a(int i2, boolean z2, boolean z3) {
        Aweme i3;
        boolean z4;
        al s2 = s();
        Aweme a2 = a(w());
        if (s2 != null && a2 != null) {
            if (!z2) {
                i3 = s2.r(a2);
            } else {
                i3 = s2.i(a2);
            }
            if (i3 != null && !TextUtils.equals(i3.getAid(), this.bi)) {
                aj a3 = a(i3.getAid());
                Video video = i3.getVideo();
                if (video != null && com.ss.android.ugc.aweme.player.c.m()) {
                    video.setRationAndSourceId(i3.getAid());
                }
                if (a3 != null && a3.p().x() != null && a3.p().x().isValid() && video != null) {
                    if (com.ss.android.ugc.aweme.player.c.j() && a2.getVideo() != null && a2.getVideo().getDuration() > com.ss.android.ugc.aweme.player.c.k()) {
                        return;
                    }
                    if (!com.ss.android.ugc.aweme.player.c.i() || video.getDuration() <= com.ss.android.ugc.aweme.player.c.k()) {
                        int b2 = ac.b(video.getPlayAddr());
                        boolean z5 = true;
                        boolean z6 = false;
                        if (!com.ss.android.ugc.aweme.player.c.n() || !ac.a(i3) || b2 < com.ss.android.ugc.aweme.player.c.o() || b2 >= com.ss.android.ugc.aweme.player.c.f()) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (!z3 || b2 >= com.ss.android.ugc.aweme.player.c.f() || z4) {
                            this.bi = i3.getAid();
                            i3.getDesc();
                            this.G.put(this.bi, new b(this.bi, i2));
                            if (i2 == 1 && !com.ss.android.ugc.aweme.player.c.g()) {
                                i3.getDesc();
                                z5 = false;
                            }
                            if (!z4 || !com.ss.android.ugc.aweme.player.c.p()) {
                                z6 = z5;
                            }
                            a(i3, a3.p().x(), z6, a3.e());
                            this.bj = null;
                            this.bm = null;
                            this.bk = null;
                            this.bl = null;
                            return;
                        }
                        this.bj = i3;
                        this.bk = video.getPlayAddr();
                        this.bl = a3.e();
                        this.bm = a3.p().x();
                        i3.getAid();
                        this.bj.getDesc();
                        VideoUrlModel videoUrlModel = this.bk;
                        if (videoUrlModel != null) {
                            videoUrlModel.getBitRatedRatioUri();
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(String str, long j2, long j3) {
        float f2;
        int i2;
        String str2;
        if (j3 == 0) {
            f2 = 0.0f;
        } else {
            f2 = (((float) j2) * 100.0f) / ((float) j3);
        }
        Aweme a2 = a(w());
        al s2 = s();
        if (a2 != null) {
            aj w2 = w();
            if (w2 != null) {
                w2.p().onPlayProgressChange(f2);
                w2.p().onPlayProgressChange(str, j2, j3);
            }
            if (a2.getVideoControl() != null && a2.getVideoControl().showProgressBar == 1) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.e(a2, this.f92899d, this.f92900e, f2, s2));
            }
            if (g.d(a2)) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.ui.seekbar.g(a2, Long.valueOf(j2), Long.valueOf(j3)));
            }
            Video video = a2.getVideo();
            if (video != null) {
                i2 = video.getDuration();
                if (i2 <= 0) {
                    return;
                }
            } else {
                i2 = 0;
            }
            double d2 = (double) ((((float) i2) * (f2 / 100.0f)) / 1000.0f);
            if (this.M < Math.floor(d2) && s2 != null) {
                a2.getAid();
                Math.floor(d2);
            }
            this.M = d2;
            if (com.ss.android.ugc.aweme.feed.background.c.a() && s2 != null) {
                if (com.ss.android.ugc.aweme.feed.experiment.c.b()) {
                    str2 = "enter_background";
                } else {
                    str2 = "click_play";
                }
                String a_ = s2.a_(true);
                h.f.b.l.d(str2, "");
                if (a_ != null && com.ss.android.ugc.aweme.feed.helper.a.a(a2) && (!h.f.b.l.a((Object) str2, (Object) "click_play") || com.ss.android.ugc.aweme.feed.helper.a.f93313a)) {
                    com.ss.android.ugc.aweme.feed.helper.a.f93313a = false;
                    com.ss.android.ugc.aweme.feed.helper.a.a(a2, a_, str2);
                }
            }
            this.aU.a();
            if (U()) {
                if (0 == j2) {
                    this.aD = true;
                }
                if (Math.abs(j3 - j2) <= InteractFirstFrameTimeOutDurationSetting.DEFAULT && this.aD) {
                    this.aD = false;
                    a.C2958a.a().a(3);
                }
            }
        }
    }

    private void a(aj ajVar, boolean z2, int i2) {
        IAdCardService c2 = AdCardServiceImpl.c();
        if (c2 != null) {
            c2.b().b(ajVar.b());
        }
        if (!com.ss.android.ugc.aweme.feed.helper.h.a().f93343f) {
            Aweme b2 = ajVar.b();
            bk.a().f75674b = b2;
            int i3 = 300;
            if (com.ss.android.ugc.aweme.utils.v.b(b2) && !com.ss.android.ugc.aweme.utils.v.a(b2)) {
                int c3 = com.ss.android.ugc.aweme.ad.feed.g.c();
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.K(b2)) {
                    if (z2) {
                        ajVar.t().q();
                    }
                    int showSeconds = com.ss.android.ugc.aweme.commercialize.e.a.b.e(b2).getShowSeconds();
                    ajVar.t().a(Integer.valueOf(showSeconds));
                    if (c3 >= 0 || (c3 = showSeconds) >= 0) {
                        bk a2 = bk.a();
                        if (c3 != 0) {
                            i3 = (c3 * 1000) + i2;
                        }
                        a2.a(i3, new p(ajVar));
                        b2.getAid();
                        q();
                    }
                } else {
                    if (z2) {
                        ajVar.t().b(i());
                    }
                    int i4 = 0;
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.d(b2)) {
                        i4 = com.ss.android.ugc.aweme.commercialize.e.a.b.e(b2).getShowSeconds();
                    } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.ao(b2)) {
                        i4 = b2.getAwemeRawAd().getShowButtonSeconds();
                    }
                    ajVar.t().a(Integer.valueOf(i4));
                    if (c3 < 0) {
                        c3 = i4;
                    }
                    if (c3 > 0) {
                        bk.a().a((c3 * 1000) + i2, new q(ajVar));
                        b2.getAid();
                        q();
                    }
                }
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.M(b2)) {
                if (!com.ss.android.ugc.aweme.commercialize.e.a.b.O(b2)) {
                    if (z2) {
                        ajVar.t().q();
                    }
                    bk.a().a(300, new v(ajVar));
                    b2.getAid();
                    q();
                } else {
                    return;
                }
            }
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aH(b2) && z2) {
                ajVar.t().r();
            }
            if (b2 != null && b2.getFloatingCardInfo() != null && ajVar.v() != null) {
                b2.getAid();
                q();
            }
        }
    }

    private void a(Aweme aweme, Surface surface, boolean z2, ag agVar) {
        Audio.InfoIdType infoIdType;
        aweme.getDesc();
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme) && surface != null && surface.isValid() && !aweme.isLive()) {
            Video video = aweme.getVideo();
            Audio audio = aweme.getAudio();
            if (video != null && aweme.getVideo().getProperPlayAddr() != null) {
                video.setRationAndSourceId(aweme.getAid());
                n.b bVar = new n.b();
                bVar.a(com.ss.android.ugc.aweme.video.simcommon.a.a(video));
                bVar.f143496a.f143491k = surface;
                bVar.f(video.isNeedSetCookie());
                bVar.g(z2);
                boolean a2 = com.ss.android.ugc.aweme.video.util.d.a(aweme);
                bVar.a(Audio.convertToSimAudio(video, audio));
                if (a2) {
                    infoIdType = Audio.InfoIdType.TRANSLATED;
                } else {
                    infoIdType = Audio.InfoIdType.ORIGINAL;
                }
                bVar.c(infoIdType.getInfoId());
                bVar.a(video.getVideoAdTag());
                bVar.m(false);
                com.ss.android.ugc.aweme.video.c.c a3 = com.ss.android.ugc.aweme.video.util.d.a(video, true);
                if (a3 != null) {
                    bVar.b(a3.f143364b);
                    bVar.l(a3.f143363a);
                    bVar.b(a3.f143365c);
                }
                if (agVar != null) {
                    bVar.b(agVar.f91900a);
                }
                M().a(bVar.f143496a);
            }
        }
    }

    private JSONObject b(String str, aj ajVar, long j2, String str2, boolean z2, boolean z3) {
        Aweme b2;
        Video video;
        VideoUrlModel playAddr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        List<BitRate> bitRate;
        int i8;
        if (ajVar == null || ajVar.b() == null || (video = (b2 = ajVar.b()).getVideo()) == null || (playAddr = video.getPlayAddr()) == null) {
            return null;
        }
        al s2 = s();
        try {
            JSONObject b3 = RequestIdService.a().b(ajVar.b(), this.f92900e);
            int i9 = 1;
            if (s2 != null) {
                b3.put("enter_from", s2.a_(true));
            }
            b3.put("duration", j2);
            b3.put("position", M().n());
            b3.put("end_type", str2);
            b3.put("player_type", M().a().toString());
            b3.put("play_order", this.D);
            b3.put("play_sess", c(this.E));
            if (ax.a(com.bytedance.ies.ugc.appcontext.d.a())) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            b3.put("is_new_user", i2);
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(b2)) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            b3.put("is_ad", i3);
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.G(b2)) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            b3.put("is_splash", i4);
            if (ac.a(playAddr)) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            b3.put("is_cache", i5);
            if (this.aC) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            b3.put("is_first", i6);
            b3.put("video_duration", playAddr.getDuration());
            b3.put("start_t", e(str) - g(str));
            int i10 = -1;
            if (ac.a(playAddr)) {
                b3.put("cache_size", ac.b(playAddr) / 1024);
            } else {
                b3.put("cache_size", -1);
            }
            if (com.ss.android.ugc.aweme.player.c.h()) {
                if (z3) {
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                b3.put("block_type", i8);
            }
            if (VideoBitRateABManager.f143220a.d()) {
                Integer a2 = com.ss.android.ugc.aweme.feed.x.j.a(playAddr);
                int b4 = com.ss.android.ugc.aweme.feed.x.j.b(playAddr);
                if (a2 == null && (bitRate = video.getBitRate()) != null) {
                    Iterator<BitRate> it = bitRate.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BitRate next = it.next();
                        if (!(next == null || next.getPlayAddr() == null || TextUtils.isEmpty(next.getPlayAddr().getUri()) || playAddr.getUri() == null || !playAddr.getUri().startsWith(next.getPlayAddr().getUri()))) {
                            a2 = Integer.valueOf(next.getBitRate());
                            b4 = next.getQualityType();
                            break;
                        }
                    }
                }
                if (a2 != null) {
                    i10 = a2.intValue();
                }
                b3.put("video_bitrate", i10);
                b3.put("video_quality", b4);
                List<BitRate> bitRate2 = playAddr.getBitRate();
                if (bitRate2 != null && !bitRate2.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (BitRate bitRate3 : bitRate2) {
                        jSONArray.put(bitRate3.getGearName());
                    }
                    b3.put("bitrate_set", jSONArray);
                }
            }
            Session a3 = com.ss.android.ugc.playerkit.session.a.f148854a.a();
            if (a3 != null) {
                if (a3.bytevc1) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                b3.put("is_bytevc1", i7);
            }
            b3.put("internet_speed", com.ss.android.ugc.h.g.f());
            b3.put("group_id", com.ss.android.ugc.aweme.metrics.ac.e(ajVar.b()));
            if (!z2) {
                b3.put("drop_cnt", M().k());
            } else {
                com.ss.android.ugc.playerkit.model.v m2 = com.ss.android.ugc.aweme.video.preload.s.b().m(com.ss.android.ugc.aweme.video.simcommon.a.a(playAddr));
                if (m2 != null) {
                    b3.put("request_info", m2.toString());
                }
            }
            b3.put("video_size", String.valueOf(ac.d(playAddr)));
            if (!com.ss.android.ugc.aweme.feed.background.c.a()) {
                i9 = 0;
            }
            b3.put("is_audio_mode", String.valueOf(i9));
            return b3;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
