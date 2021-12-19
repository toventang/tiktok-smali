package com.lynx.tasm.behavior.shadow.text;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.g;
import com.lynx.tasm.behavior.shadow.i;
import com.lynx.tasm.behavior.ui.c;
import com.lynx.tasm.behavior.utils.e;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.utils.j;
import java.text.Bidi;
import java.util.List;

public class BaseTextShadowNode extends ShadowNode {

    /* renamed from: a  reason: collision with root package name */
    private boolean f55978a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f55979b;

    /* renamed from: c  reason: collision with root package name */
    private float f55980c = 1.0E21f;
    public k p = new k();
    public boolean q;
    protected int r;

    static {
        Covode.recordClassIndex(34978);
    }

    @m(a = "direction", e = 0)
    public void setDirection(int i2) {
        this.p.f56011e = i2;
        d();
    }

    @m(a = "enable-font-scaling")
    public void setEnableFontScaling(String str) {
        a(Boolean.parseBoolean(str));
    }

    @m(a = "include-font-padding")
    public void setIncludeFontPadding(boolean z) {
        this.p.p = z;
        d();
    }

    @m(a = "letter-spacing", d = 1.0E21f)
    public void setLetterSpacing(float f2) {
        this.p.f56018l = f2;
        d();
    }

    @m(a = "text-align", e = 3)
    public void setTextAlign(int i2) {
        this.p.f56010d = i2;
        d();
    }

    @m(a = "text-decoration", e = 0)
    public void setTextDecoration(int i2) {
        this.p.s = i2;
        d();
    }

    @m(a = "text-overflow", e = 0)
    public void setTextOverflow(int i2) {
        this.p.f56016j = i2;
        d();
    }

    @m(a = "white-space", e = 0)
    public void setWhiteSpace(int i2) {
        this.p.f56015i = i2;
        d();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        protected int f55984a;

        /* renamed from: b  reason: collision with root package name */
        protected int f55985b;

        /* renamed from: c  reason: collision with root package name */
        protected Object f55986c;

        static {
            Covode.recordClassIndex(34981);
        }

        public void a(SpannableStringBuilder spannableStringBuilder) {
            int i2;
            int i3 = this.f55984a;
            if (i3 == 0) {
                i2 = 18;
            } else {
                i2 = 34;
            }
            spannableStringBuilder.setSpan(this.f55986c, i3, this.f55985b, i2);
        }

        public b(int i2, int i3, Object obj) {
            this.f55984a = i2;
            this.f55985b = i3;
            this.f55986c = obj;
        }
    }

    @m(a = "line-spacing", d = 0.0f)
    public void setLineSpacing(float f2) {
        if (this.q) {
            this.p.f56019m = f2;
        } else {
            this.p.f56019m = j.c(f2);
        }
        d();
    }

    @m(a = "text-shadow")
    public void setTextShadow(ReadableArray readableArray) {
        this.p.r = null;
        if (readableArray != null) {
            List<c> a2 = c.a(readableArray);
            if (a2.size() != 0) {
                this.p.r = a2.get(0);
            }
        }
    }

    @m(a = "use-web-line-height")
    public void setUseWebLineHeight(boolean z) {
        if (this.f55979b != z) {
            this.f55979b = z;
            float f2 = this.f55980c;
            if (f2 != 1.0E21f) {
                setLineHeight(f2);
            }
        }
    }

    @m(a = "word-break")
    public void setWordBreakStrategy(int i2) {
        if (i2 == 1) {
            this.r = 1;
        } else if (i2 == 0) {
            this.r = 2;
        } else {
            this.r = 0;
        }
        d();
    }

    private void a(boolean z) {
        this.f55978a = z;
        setFontSize(this.p.n);
        for (int i2 = 0; i2 < f(); i2++) {
            ShadowNode b2 = b(i2);
            if (b2 instanceof BaseTextShadowNode) {
                ((BaseTextShadowNode) b2).a(this.f55978a);
            }
        }
    }

    @m(a = com.bytedance.ies.xelement.pickview.b.b.f37372a)
    public void setColor(com.lynx.react.bridge.a aVar) {
        if (aVar.h() != ReadableType.Array) {
            if (aVar.h() == ReadableType.Int) {
                this.p.f56009c = Integer.valueOf(aVar.d());
            } else {
                this.p.f56009c = null;
            }
            d();
        }
    }

    @m(a = "font-family")
    public void setFontFamily(String str) {
        if (str == null) {
            if (!TextUtils.isEmpty(this.p.q)) {
                this.p.q = null;
                d();
            }
        } else if (!str.equals(this.p.q)) {
            this.p.q = str;
            d();
        }
    }

    @m(a = com.bytedance.ies.xelement.pickview.b.b.f37373b, d = 1.0E21f)
    public void setFontSize(float f2) {
        if (f2 != 1.0E21f) {
            f2 = (float) Math.round(f2);
        }
        if (this.f55978a) {
            f2 = j.b(j.c(f2)) * this.f55960k.a().getResources().getConfiguration().fontScale;
        }
        float f3 = (float) ((int) f2);
        if (this.p.n != f3) {
            this.p.n = f3;
        }
        d();
    }

    @m(a = "font-style", e = 0)
    public void setFontStyle(int i2) {
        if (i2 == 0) {
            if (this.p.f56014h != 0) {
                this.p.f56014h = 0;
                d();
            }
        } else if ((i2 == 1 || i2 == 2) && this.p.f56014h != 2) {
            this.p.f56014h = 2;
            d();
        }
    }

    @m(a = com.bytedance.ies.xelement.pickview.b.b.f37374c, e = 0)
    public void setFontWeight(int i2) {
        int i3 = 0;
        switch (i2) {
            case 1:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                i3 = 1;
                break;
        }
        if (i2 != this.p.f56013g) {
            this.p.f56013g = i2;
            this.p.f56014h = i3;
            d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r3.p.f56008b < 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r3.p.f56008b = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3.p.f56008b = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
    @com.lynx.tasm.behavior.m(a = "text-maxlength")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextMaxLength(java.lang.String r4) {
        /*
            r3 = this;
            r2 = -1
            com.lynx.tasm.behavior.shadow.text.k r1 = r3.p     // Catch:{ all -> 0x0017 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0017 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0017 }
            r1.f56008b = r0     // Catch:{ all -> 0x0017 }
            r3.d()     // Catch:{ all -> 0x0017 }
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p
            int r0 = r0.f56008b
            if (r0 >= 0) goto L_0x0026
            goto L_0x0021
        L_0x0017:
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p     // Catch:{ all -> 0x0027 }
            r0.f56008b = r2     // Catch:{ all -> 0x0027 }
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p
            int r0 = r0.f56008b
            if (r0 >= 0) goto L_0x0026
        L_0x0021:
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p
            r0.f56008b = r2
            return
        L_0x0026:
            return
        L_0x0027:
            r1 = move-exception
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p
            int r0 = r0.f56008b
            if (r0 >= 0) goto L_0x0032
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p
            r0.f56008b = r2
        L_0x0032:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode.setTextMaxLength(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r3.p.f56007a < 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r3.p.f56007a = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3.p.f56007a = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
    @com.lynx.tasm.behavior.m(a = "text-maxline")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextMaxLine(java.lang.String r4) {
        /*
            r3 = this;
            r2 = -1
            com.lynx.tasm.behavior.shadow.text.k r1 = r3.p     // Catch:{ all -> 0x0017 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0017 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0017 }
            r1.f56007a = r0     // Catch:{ all -> 0x0017 }
            r3.d()     // Catch:{ all -> 0x0017 }
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p
            int r0 = r0.f56007a
            if (r0 >= 0) goto L_0x0026
            goto L_0x0021
        L_0x0017:
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p     // Catch:{ all -> 0x0027 }
            r0.f56007a = r2     // Catch:{ all -> 0x0027 }
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p
            int r0 = r0.f56007a
            if (r0 >= 0) goto L_0x0026
        L_0x0021:
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p
            r0.f56007a = r2
            return
        L_0x0026:
            return
        L_0x0027:
            r1 = move-exception
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p
            int r0 = r0.f56007a
            if (r0 >= 0) goto L_0x0032
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.p
            r0.f56007a = r2
        L_0x0032:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode.setTextMaxLine(java.lang.String):void");
    }

    @m(a = "text-vertical-align")
    public void setTextVerticalAlign(String str) {
        if ("top".equals(str)) {
            this.p.f56012f = 0;
        } else if ("center".equals(str)) {
            this.p.f56012f = 1;
        } else if ("bottom".equals(str)) {
            this.p.f56012f = 2;
        }
        d();
    }

    public static class a extends b {

        /* renamed from: d  reason: collision with root package name */
        private final Layout.Alignment f55981d;

        /* renamed from: e  reason: collision with root package name */
        private final int f55982e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f55983f;

        static {
            Covode.recordClassIndex(34980);
        }

        @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode.b
        public final void a(SpannableStringBuilder spannableStringBuilder) {
            int i2;
            if (this.f55984a == 0) {
                i2 = 18;
            } else {
                i2 = 34;
            }
            Layout.Alignment alignment = this.f55981d;
            if (this.f55982e == 0 && !this.f55983f && !new Bidi(spannableStringBuilder.subSequence(this.f55984a, this.f55985b).toString(), -2).baseIsLeftToRight()) {
                alignment = alignment == Layout.Alignment.ALIGN_NORMAL ? Layout.Alignment.ALIGN_OPPOSITE : alignment == Layout.Alignment.ALIGN_OPPOSITE ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            spannableStringBuilder.setSpan(new LynxStandardAlignmentSpan(alignment), this.f55984a, this.f55985b, i2);
        }

        public a(int i2, int i3, Layout.Alignment alignment, int i4, boolean z) {
            super(i2, i3, null);
            this.f55981d = alignment;
            this.f55982e = i4;
            this.f55983f = z;
        }
    }

    @m(a = "line-height", d = 1.0E21f)
    public void setLineHeight(float f2) {
        this.f55980c = f2;
        if (this.f55979b && f2 != 1.0E21f) {
            f2 = j.a((float) ((int) j.c(f2)));
        } else if (this.f55978a) {
            f2 = j.b(j.c(f2)) * this.f55960k.a().getResources().getConfiguration().fontScale;
        }
        if (this.p.f56017k != f2) {
            this.p.f56017k = f2;
            d();
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void b(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                switch (nextKey.hashCode()) {
                    case -2137322088:
                        if (!nextKey.equals("include-font-padding")) {
                            break;
                        } else {
                            setIncludeFontPadding(readableMap.getBoolean(nextKey, false));
                            break;
                        }
                    case 125536225:
                        if (!nextKey.equals("use-web-line-height")) {
                            break;
                        } else {
                            setUseWebLineHeight(readableMap.getBoolean(nextKey, false));
                            break;
                        }
                    case 1629007544:
                        if (!nextKey.equals("text-maxline")) {
                            break;
                        } else {
                            setTextMaxLine(readableMap.getString(nextKey));
                            break;
                        }
                    case 2104465578:
                        if (!nextKey.equals("text-maxlength")) {
                            break;
                        } else {
                            setTextMaxLength(readableMap.getString(nextKey));
                            break;
                        }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e2.toString());
            }
        }
        super.b(vVar);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void a(ShadowNode shadowNode, int i2) {
        super.a(shadowNode, i2);
        if (shadowNode instanceof BaseTextShadowNode) {
            ((BaseTextShadowNode) shadowNode).a(this.f55978a);
        }
    }

    /* access modifiers changed from: protected */
    public void a(SpannableStringBuilder spannableStringBuilder, RawTextShadowNode rawTextShadowNode) {
        if (rawTextShadowNode.f55989b) {
            spannableStringBuilder.append((CharSequence) e.a(rawTextShadowNode.f55988a));
        } else {
            spannableStringBuilder.append((CharSequence) e.b(rawTextShadowNode.f55988a));
        }
    }

    public void a(SpannableStringBuilder spannableStringBuilder, List<b> list) {
        int length = spannableStringBuilder.length();
        int f2 = f();
        for (int i2 = 0; i2 < f2; i2++) {
            ShadowNode b2 = b(i2);
            if (b2 instanceof RawTextShadowNode) {
                RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) b2;
                if (rawTextShadowNode.f55988a != null) {
                    a(spannableStringBuilder, rawTextShadowNode);
                }
            } else if (b2 instanceof BaseTextShadowNode) {
                BaseTextShadowNode baseTextShadowNode = (BaseTextShadowNode) b2;
                baseTextShadowNode.a(spannableStringBuilder, list);
                k kVar = this.p;
                kVar.o = baseTextShadowNode.p.o | kVar.o;
            } else if (b2 instanceof AbsInlineImageShadowNode) {
                spannableStringBuilder.append("I");
                ((AbsInlineImageShadowNode) b2).a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), list);
                this.p.o = true;
            } else {
                throw new RuntimeException("Unexpected view type nested under text node: " + b2.getClass());
            }
        }
        int length2 = spannableStringBuilder.length();
        if (length2 > length) {
            a(length, length2, list);
        }
    }

    private void a(int[] iArr, double[] dArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = 1.0E21f;
            int i3 = 1;
            boolean z = true;
            switch (iArr[i2]) {
                case 1:
                    setFontSize((float) dArr[i2]);
                    break;
                case 2:
                    int i4 = (int) ((long) dArr[i2]);
                    if (i4 == 0) {
                        i4 = -16777216;
                    }
                    this.p.f56009c = Integer.valueOf(i4);
                    break;
                case 3:
                    this.p.f56015i = (int) dArr[i2];
                    break;
                case 4:
                    this.p.f56016j = (int) dArr[i2];
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    int i5 = (int) dArr[i2];
                    switch (i5) {
                        case 1:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        default:
                            i3 = 0;
                            break;
                    }
                    this.p.f56013g = i5;
                    this.p.f56014h = i3;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    int i6 = (int) dArr[i2];
                    if (i6 == 0) {
                        if (this.p.f56014h != 0) {
                            this.p.f56014h = 0;
                            break;
                        } else {
                            break;
                        }
                    } else if ((i6 == 1 || i6 == 2) && this.p.f56014h != 2) {
                        this.p.f56014h = 2;
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    float f3 = (float) dArr[i2];
                    if (f3 != -1.0f) {
                        f2 = f3;
                    }
                    setLineHeight(f2);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if (((int) dArr[i2]) == 0) {
                        z = false;
                    }
                    a(z);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    float f4 = (float) dArr[i2];
                    if (f4 != -1.0f) {
                        f2 = f4;
                    }
                    this.p.f56018l = f2;
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    float f5 = (float) dArr[i2];
                    if (f5 == -1.0f) {
                        f5 = 0.0f;
                    }
                    this.p.f56019m = j.c(f5);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    this.p.f56010d = (int) dArr[i2];
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    int i7 = (int) dArr[i2];
                    if (i7 != 0) {
                        if (i7 == 1) {
                            this.r = 1;
                            break;
                        } else {
                            this.r = 0;
                            break;
                        }
                    } else {
                        this.r = 2;
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if (((int) dArr[i2]) == 0) {
                        this.p.s &= -2;
                        break;
                    } else {
                        this.p.s |= 1;
                        break;
                    }
                case ABRConfig.ABR_SELECT_SCENE:
                    if (((int) dArr[i2]) == 0) {
                        this.p.s &= -3;
                        break;
                    } else {
                        this.p.s |= 2;
                        break;
                    }
                case 15:
                    if (((int) dArr[i2]) == 0) {
                        this.p.r = null;
                        break;
                    } else {
                        k kVar = this.p;
                        if (kVar.r == null) {
                            kVar.r = new c();
                            break;
                        } else {
                            break;
                        }
                    }
                case 16:
                    this.p.r.f56145b = (float) dArr[i2];
                    break;
                case 17:
                    this.p.r.f56146c = (float) dArr[i2];
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    this.p.r.f56147d = (float) dArr[i2];
                    break;
                case 19:
                    this.p.r.f56144a = (int) ((long) dArr[i2]);
                    break;
                case com.ss.android.ugc.playerkit.model.v.U /*{ENCODED_INT: 20}*/:
                    if (this.f55961l == null) {
                        this.f55961l = new i();
                    }
                    this.f55961l.f55971a = (int) dArr[i2];
                    break;
                case 21:
                    if (this.f55961l == null) {
                        this.f55961l = new i();
                    }
                    this.f55961l.f55972b = (float) dArr[i2];
                    break;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void a(int[] iArr, double[] dArr, String str) {
        String str2 = "FiberBaseText.setTextStyleData." + e();
        TraceEvent.a(0, str2);
        if (iArr.length > 0 || !this.p.q.equals(str)) {
            d();
        }
        this.p.q = str;
        a(iArr, dArr);
        TraceEvent.b(0, str2);
    }

    /* access modifiers changed from: protected */
    public void a(int i2, int i3, List<b> list) {
        boolean z;
        if (this.p.f56009c != null) {
            list.add(new b(i2, i3, new h(this.p.f56009c.intValue())));
        }
        if ((this.p.s & 2) != 0) {
            list.add(new b(i2, i3, new LynxStrikethroughSpan()));
        }
        if ((this.p.s & 1) != 0) {
            list.add(new b(i2, i3, new LynxUnderlineSpan()));
        }
        if (this.p.f56011e == 0) {
            Layout.Alignment b2 = this.p.b();
            int i4 = this.p.f56011e;
            if (this.p.f56010d == 3) {
                z = true;
            } else {
                z = false;
            }
            list.add(new a(i2, i3, b2, i4, z));
        }
        if (this.p.f56012f != -1 && Build.VERSION.SDK_INT > 25) {
            list.add(new b(i2, i3, new a(this.p.f56012f)));
        }
        if (!g.a(this.p.f56017k)) {
            list.add(new b(i2, i3, new c(this.p.f56017k, this.q)));
        }
        if (this.p.r != null) {
            list.add(new b(i2, i3, new i(this.p.r)));
        }
        if (this.p.f56018l != 1.0E21f && Build.VERSION.SDK_INT >= 21) {
            list.add(new b(i2, i3, new b(this.p.f56018l)));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            list.add(new b(i2, i3, new d(this.p.f56014h, this.p.f56013g)));
        } else if (this.p.f56014h == 1 || this.p.f56014h == 2) {
            list.add(new b(i2, i3, new StyleSpan(this.p.a())));
        }
    }
}
