package com.ss.android.ugc.aweme.ttlive;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.a;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import f.a.t;
import java.util.Map;
import l.b.f;
import l.b.j;
import l.b.w;
import l.b.x;

public interface ILiveApi {
    static {
        Covode.recordClassIndex(92385);
    }

    @w
    @f
    b<TypedInput> downloadFile(@a boolean z, @o int i2, @x String str, @j Map<String, String> map, @d Object obj);

    @f
    b<TypedInput> get(@x String str, @j Map<String, String> map, @d Object obj);

    @f(a = "/tiktok/v1/edibility/birthdate/")
    t<a> getDoBStatus();

    @l.b.o
    b<TypedInput> post(@x String str, @com.bytedance.retrofit2.b.b TypedByteArray typedByteArray, @j Map<String, String> map, @d Object obj);

    @l.b.o
    b<TypedInput> postMultiPart(@o int i2, @x String str, @j Map<String, String> map, @com.bytedance.retrofit2.b.b TypedOutput typedOutput);
}
