package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.a;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.v;
import java.text.DecimalFormat;

public class RawTextShadowNode extends ShadowNode {

    /* renamed from: a  reason: collision with root package name */
    public String f55988a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f55989b;

    static {
        Covode.recordClassIndex(34987);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final boolean a() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public String toString() {
        return e() + " [text: " + this.f55988a + "]";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.shadow.text.RawTextShadowNode$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55990a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 34989(0x88ad, float:4.903E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.react.bridge.ReadableType[] r0 = com.lynx.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.AnonymousClass1.f55990a = r2
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.AnonymousClass1.f55990a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Int     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.AnonymousClass1.f55990a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Long     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.AnonymousClass1.f55990a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.AnonymousClass1.f55990a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.AnonymousClass1.f55990a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.RawTextShadowNode.AnonymousClass1.<clinit>():void");
        }
    }

    @m(a = "pseudo")
    public void setPsuedo(boolean z) {
        this.f55989b = z;
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    public final void b(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                if (nextKey.equals("text")) {
                    setText(readableMap.getDynamic("text"));
                } else if (nextKey.equals("pseudo")) {
                    setPsuedo(readableMap.getBoolean(nextKey, false));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e2.toString());
            }
        }
        super.b(vVar);
    }

    @m(a = "text")
    public void setText(a aVar) {
        switch (AnonymousClass1.f55990a[aVar.h().ordinal()]) {
            case 1:
                this.f55988a = aVar.e();
                break;
            case 2:
            case 3:
                this.f55988a = String.valueOf(aVar.d());
                break;
            case 4:
                this.f55988a = new DecimalFormat("###################.###########").format(aVar.c());
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                this.f55988a = String.valueOf(aVar.b());
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                this.f55988a = null;
                break;
        }
        d();
    }
}
