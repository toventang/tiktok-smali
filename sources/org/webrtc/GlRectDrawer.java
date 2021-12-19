package org.webrtc;

import com.bytedance.covode.number.Covode;
import org.webrtc.GlGenericDrawer;

public class GlRectDrawer extends GlGenericDrawer {

    /* renamed from: org.webrtc.GlRectDrawer$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(106593);
        }
    }

    static {
        Covode.recordClassIndex(106592);
    }

    static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        static {
            Covode.recordClassIndex(106594);
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i2, int i3, int i4, int i5) {
        }

        private ShaderCallbacks() {
        }

        /* synthetic */ ShaderCallbacks(AnonymousClass1 r1) {
            this();
        }
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public GlRectDrawer() {
        super("void main() {\n  gl_FragColor = sample(tc);\n}\n", new ShaderCallbacks(null));
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawOes(int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int i8) {
        super.drawOes(i2, fArr, i3, i4, i5, i6, i7, i8);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int i2, float[] fArr, int i3, int i4, int i5, int i6, int i7, int i8) {
        super.drawRgb(i2, fArr, i3, i4, i5, i6, i7, i8);
    }

    @Override // org.webrtc.RendererCommon.GlDrawer, org.webrtc.GlGenericDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] iArr, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super.drawYuv(iArr, fArr, i2, i3, i4, i5, i6, i7);
    }
}
