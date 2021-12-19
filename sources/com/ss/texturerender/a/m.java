package com.ss.texturerender.a;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.texturerender.g;
import com.ss.texturerender.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class m extends j {
    private final String M = "precision mediump float;\nuniform sampler2D sTexture;\nuniform sampler2D lutTexture;\nvarying vec2 vTextureCoord;\nuniform float strength;\nvoid main() {\n    vec4 inputTexColor = texture2D(sTexture, vTextureCoord);\n    float blueColor = inputTexColor.b * 63.0;\n    vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 7.999);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    vec2 texturePos1;\n    texturePos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec2 texturePos2;\n    texturePos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec4 newColor1 = texture2D(lutTexture, texturePos1);\n    vec4 newColor2 = texture2D(lutTexture, texturePos2);\n    vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    gl_FragColor = mix(inputTexColor, vec4(newColor.rgb, inputTexColor.w), strength);\n}";
    private int N;
    private int O;
    private HashMap<Integer, a> P = new HashMap<>();
    private int Q;

    static {
        Covode.recordClassIndex(101238);
    }

    private void d() {
        for (a aVar : this.P.values()) {
            aVar.f151809b = false;
        }
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final a a() {
        d();
        e();
        l.a("TR_GLLutFilter", "release,this:".concat(String.valueOf(this)));
        return super.a();
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f151808a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f151809b = true;

        /* renamed from: c  reason: collision with root package name */
        public float f151810c = 1.0f;

        static {
            Covode.recordClassIndex(101239);
        }

        public final String toString() {
            return "[texID:" + this.f151808a + ",strength:" + this.f151810c + ",using:" + this.f151809b + "]";
        }

        public a(int i2) {
            this.f151808a = i2;
        }
    }

    public m() {
        super(2);
        this.f151775c = 15;
        l.a("TR_GLLutFilter", "new GLLutFilter,this:".concat(String.valueOf(this)));
    }

    private void e() {
        Iterator<Map.Entry<Integer, a>> it = this.P.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (!value.f151809b) {
                g.b(value.f151808a);
                it.remove();
            }
        }
    }

    @Override // com.ss.texturerender.a.j
    public final int b() {
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.P.get(Integer.valueOf(this.Q)).f151808a);
        GLES20.glUniform1i(this.O, 1);
        GLES20.glUniform1f(this.N, this.P.get(Integer.valueOf(this.Q)).f151810c);
        return 0;
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final String b(int i2) {
        if (i2 != 11001) {
            return super.b(i2);
        }
        return "precision mediump float;\nuniform sampler2D sTexture;\nuniform sampler2D lutTexture;\nvarying vec2 vTextureCoord;\nuniform float strength;\nvoid main() {\n    vec4 inputTexColor = texture2D(sTexture, vTextureCoord);\n    float blueColor = inputTexColor.b * 63.0;\n    vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 7.999);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    vec2 texturePos1;\n    texturePos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec2 texturePos2;\n    texturePos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.r);\n    texturePos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * inputTexColor.g);\n    vec4 newColor1 = texture2D(lutTexture, texturePos1);\n    vec4 newColor2 = texture2D(lutTexture, texturePos2);\n    vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    gl_FragColor = mix(inputTexColor, vec4(newColor.rgb, inputTexColor.w), strength);\n}";
    }

    private void a(float f2) {
        if (f2 >= 0.0f && f2 <= 1.0f) {
            for (a aVar : this.P.values()) {
                aVar.f151810c = f2;
            }
        }
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final int a(Bundle bundle) {
        HashMap hashMap;
        super.a(bundle);
        this.N = GLES20.glGetUniformLocation(this.p, "strength");
        this.O = GLES20.glGetUniformLocation(this.p, "lutTexture");
        d();
        if (bundle.containsKey("lut_bitmap")) {
            if (bundle.getParcelable("lut_bitmap") != null) {
                a(0, (Bitmap) bundle.getParcelable("lut_bitmap"));
            }
        } else if (bundle.containsKey("lut_bitmap_multi")) {
            HashMap hashMap2 = (HashMap) bundle.getSerializable("lut_bitmap_multi");
            if (hashMap2 != null) {
                for (Map.Entry entry : hashMap2.entrySet()) {
                    a(((Integer) entry.getKey()).intValue(), (Bitmap) entry.getValue());
                }
            }
        } else {
            l.a("TR_GLLutFilter", "init no bitmap,this:".concat(String.valueOf(this)));
            return -1;
        }
        e();
        if (bundle.containsKey("strength")) {
            a(bundle.getFloat("strength"));
        } else if (bundle.containsKey("strength_multi") && (hashMap = (HashMap) bundle.getSerializable("strength_multi")) != null) {
            for (Map.Entry entry2 : hashMap.entrySet()) {
                b(((Integer) entry2.getKey()).intValue(), ((Float) entry2.getValue()).floatValue());
            }
        }
        l.a("TR_GLLutFilter", "init:" + bundle.toString() + ",this:" + this + " LutMap:" + this.P);
        return 0;
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final void b(Bundle bundle) {
        if (bundle == null || this.f151773a != bundle.getInt("effect_type")) {
            super.b(bundle);
            return;
        }
        l.a("TR_GLLutFilter", "setOption:" + bundle.toString() + ",this:" + this);
        int i2 = bundle.getInt("action");
        if (i2 != 20) {
            if (i2 == 22 && !this.P.isEmpty()) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("lut_bitmap");
                if (bundle.containsKey("index")) {
                    a aVar = this.P.get(Integer.valueOf(bundle.getInt("index")));
                    if (aVar != null) {
                        b(aVar.f151808a, bitmap);
                        return;
                    }
                    return;
                }
                b(this.P.get(0).f151808a, bitmap);
            }
        } else if (bundle.containsKey("index")) {
            b(bundle.getInt("index", 0), bundle.getFloat("float_value", -1.0f));
        } else {
            a(bundle.getFloat("float_value", -1.0f));
        }
    }

    private void b(int i2, float f2) {
        a aVar;
        if (f2 >= 0.0f && f2 <= 1.0f && (aVar = this.P.get(Integer.valueOf(i2))) != null) {
            aVar.f151810c = f2;
        }
    }

    private void b(int i2, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            GLES20.glBindTexture(3553, i2);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            l.a("TR_GLLutFilter", "setBitmap:" + bitmap + ",this:" + this);
        }
    }

    private void a(int i2, Bitmap bitmap) {
        a aVar = this.P.get(Integer.valueOf(i2));
        if (aVar == null) {
            for (Map.Entry<Integer, a> entry : this.P.entrySet()) {
                a value = entry.getValue();
                if (!value.f151809b) {
                    this.P.remove(entry.getKey());
                    this.P.put(Integer.valueOf(i2), value);
                    b(value.f151808a, bitmap);
                    return;
                }
            }
            a aVar2 = new a(g.a());
            b(aVar2.f151808a, bitmap);
            this.P.put(Integer.valueOf(i2), aVar2);
            return;
        }
        b(aVar.f151808a, bitmap);
        aVar.f151809b = true;
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final f a(f fVar, i iVar) {
        int i2 = 0;
        this.Q = 0;
        while (true) {
            this.Q = i2;
            if (this.Q >= this.P.size()) {
                return fVar;
            }
            if (this.P.get(Integer.valueOf(this.Q)).f151810c > 0.0f) {
                fVar = super.a(fVar, iVar);
            }
            i2 = this.Q + 1;
        }
    }

    @Override // com.ss.texturerender.a.j, com.ss.texturerender.a.a
    public final void a(int i2, float f2) {
        if (i2 != 20) {
            super.a(i2, f2);
            return;
        }
        a(f2);
        l.a("TR_GLLutFilter", "set strength:" + f2 + ",this:" + this);
    }
}
