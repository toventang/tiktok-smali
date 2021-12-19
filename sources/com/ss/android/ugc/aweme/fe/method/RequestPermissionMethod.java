package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.permission.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class RequestPermissionMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91146a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57358);
    }

    private RequestPermissionMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57359);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ RequestPermissionMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public static final class b implements a.AbstractC3816a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f91147a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91148b;

        static {
            Covode.recordClassIndex(57360);
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.a.AbstractC3816a
        public final void a() {
            BaseCommonJavaMethod.a aVar = this.f91148b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            aVar.a((Object) jSONObject);
        }

        @Override // com.ss.android.ugc.aweme.utils.permission.a.AbstractC3816a
        public final void b() {
            BaseCommonJavaMethod.a aVar = this.f91148b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            aVar.a((Object) jSONObject);
        }

        b(Activity activity, BaseCommonJavaMethod.a aVar) {
            this.f91147a = activity;
            this.f91148b = aVar;
        }
    }

    public RequestPermissionMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    private static void a(int i2, List<String> list) {
        String[] strArr = n.f91316a.get(Integer.valueOf(i2));
        if (strArr != null) {
            for (String str : strArr) {
                list.add(str);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        JSONArray optJSONArray;
        if (jSONObject != null && aVar != null) {
            Context actContext = getActContext();
            if (!(actContext instanceof Activity)) {
                actContext = null;
            }
            Activity activity = (Activity) actContext;
            if (activity != null && (optJSONArray = jSONObject.optJSONArray("permission_list")) != null) {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = optJSONArray.get(i2);
                    if (obj instanceof Integer) {
                        a(((Number) obj).intValue(), arrayList);
                    }
                }
                int size = arrayList.size();
                String[] strArr = new String[size];
                for (int i3 = 0; i3 < size; i3++) {
                    strArr[i3] = "";
                }
                String[] strArr2 = (String[]) arrayList.toArray(strArr);
                if (strArr2 != null) {
                    b bVar = new b(activity, aVar);
                    List<String> a2 = com.ss.android.ugc.aweme.utils.permission.a.a(activity, strArr2);
                    if (a2 == null || a2.isEmpty()) {
                        bVar.a();
                    } else {
                        com.ss.android.ugc.aweme.ce.b.a(activity, strArr2, new b.AbstractC1579b(bVar) {
                            /* class com.ss.android.ugc.aweme.utils.permission.a.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AbstractC3816a f143169a;

                            static {
                                Covode.recordClassIndex(93708);
                            }

                            {
                                this.f143169a = r1;
                            }

                            @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
                            public final void a(String[] strArr, int[] iArr) {
                                if (this.f143169a == null) {
                                    return;
                                }
                                if (a.a(iArr)) {
                                    this.f143169a.a();
                                } else {
                                    this.f143169a.b();
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
