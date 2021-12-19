package android.ss.com.vboost.d;

import android.ss.com.vboost.CapabilityType;
import android.ss.com.vboost.b;
import android.ss.com.vboost.c;
import android.ss.com.vboost.c.i;
import android.ss.com.vboost.e;
import android.ss.com.vboost.g;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public class d implements Comparable {
    private static final String t = d.class.getSimpleName();
    private static final e u = e.LEVEL_9;

    /* renamed from: a  reason: collision with root package name */
    public CapabilityType f524a;

    /* renamed from: b  reason: collision with root package name */
    public e f525b;

    /* renamed from: c  reason: collision with root package name */
    public long f526c;

    /* renamed from: d  reason: collision with root package name */
    public int f527d;

    /* renamed from: e  reason: collision with root package name */
    public int f528e;

    /* renamed from: f  reason: collision with root package name */
    public b f529f;

    /* renamed from: g  reason: collision with root package name */
    public android.ss.com.vboost.d f530g;

    /* renamed from: h  reason: collision with root package name */
    public g f531h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f532i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f533j;

    /* renamed from: k  reason: collision with root package name */
    public g f534k;

    /* renamed from: l  reason: collision with root package name */
    c f535l;

    /* renamed from: m  reason: collision with root package name */
    public long f536m;
    public i n;
    public e o;
    public long p;
    public h q;
    public c r;
    public i s;

    /* access modifiers changed from: package-private */
    public final long a() {
        return this.f526c - (this.p - this.f536m);
    }

    static {
        Covode.recordClassIndex(51);
    }

    public String toString() {
        return "Request{type=" + this.f524a + ", level=" + this.f525b + ", timeout=" + this.f526c + ", tid=" + this.f527d + ", priority=" + this.f528e + ", cluster=" + this.f529f + ", timeoutStrategy=" + this.f534k + ", createTime=" + this.f536m + ", updateStrategy=" + this.n + ", info=" + this.o + ", commitTime=" + this.p + ", task=" + this.q + '}';
    }

    /* renamed from: android.ss.com.vboost.d.d$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f537a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f538b;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|54) */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0094 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0100 */
        static {
            /*
            // Method dump skipped, instructions count: 269
            */
            throw new UnsupportedOperationException("Method not decompiled: android.ss.com.vboost.d.d.AnonymousClass1.<clinit>():void");
        }
    }

    d(CapabilityType capabilityType) {
        this.f524a = capabilityType;
        switch (AnonymousClass1.f537a[capabilityType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
            case LiveRechargeAgeThresholdSetting.DEFAULT /*{ENCODED_INT: 18}*/:
                this.n = i.FIFO;
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                this.n = i.SMALL;
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
            case 15:
            case 16:
            case 17:
                this.n = i.LAGER;
                break;
        }
        switch (AnonymousClass1.f537a[capabilityType.ordinal()]) {
            case 1:
            case 2:
                this.f534k = g.ONE_TIME;
                break;
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                this.f534k = g.USER_CANCEL;
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
            case 15:
            case 16:
            case 17:
                this.f534k = g.USE_OURS;
                break;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.p = currentTimeMillis;
        this.f536m = currentTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b5 A[RETURN, SYNTHETIC] */
    @Override // java.lang.Comparable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(java.lang.Object r7) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: android.ss.com.vboost.d.d.compareTo(java.lang.Object):int");
    }
}
