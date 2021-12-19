package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.ss.android.ugc.aweme.friends.ui.f;
import com.ss.android.ugc.aweme.social.monitor.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class be {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f142669a = {"android.permission.READ_CONTACTS"};

    static {
        Covode.recordClassIndex(93330);
    }

    public static boolean a(Context context) {
        if (b.a(context, "android.permission.READ_CONTACTS") != -1) {
            return true;
        }
        return false;
    }

    public static void a(Activity activity, f fVar) {
        com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.READ_CONTACTS"}, new bf(fVar, activity));
    }

    private static int[] a(String[] strArr, int[] iArr) {
        if (strArr == null || iArr == null) {
            return null;
        }
        int min = Math.min(strArr.length, iArr.length);
        int[] iArr2 = new int[min];
        int i2 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            iArr2[i3] = i2;
            i2 += iArr[i3];
        }
        return iArr2;
    }

    public static List<ContactModelV2> a(Context context, d dVar, boolean z) {
        return a(context, dVar, null, false, z, false).f142666a;
    }

    private static bd b(Context context, d dVar, String str, boolean z, boolean z2, boolean z3) {
        int[] iArr;
        MethodCollector.i(11860);
        bd bdVar = new bd();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = ContactsContract.Data.CONTENT_URI;
        if (z && Build.VERSION.SDK_INT >= 21) {
            uri = uri.buildUpon().appendQueryParameter("android.provider.extra.ADDRESS_BOOK_INDEX", "true").build();
        }
        Cursor query = contentResolver.query(uri, null, null, null, str);
        if (query == null) {
            MethodCollector.o(11860);
            return bdVar;
        } else if (query.getCount() == 0) {
            query.close();
            MethodCollector.o(11860);
            return bdVar;
        } else {
            TreeMap treeMap = new TreeMap();
            String[] strArr = null;
            int i2 = 0;
            Exception e2 = null;
            int i3 = 0;
            while (query.moveToNext() && (!z2 || treeMap.size() != 300)) {
                try {
                    String string = query.getString(query.getColumnIndex("contact_id"));
                    ContactModelV2 contactModelV2 = (ContactModelV2) treeMap.get(string);
                    if (contactModelV2 == null) {
                        contactModelV2 = new ContactModelV2();
                        contactModelV2.phoneNumber = new ArrayList();
                        treeMap.put(string, contactModelV2);
                    }
                    if (contactModelV2.name == null) {
                        contactModelV2.name = query.getString(query.getColumnIndex("display_name"));
                    }
                    String string2 = query.getString(query.getColumnIndex("mimetype"));
                    if (!TextUtils.isEmpty(string2)) {
                        int hashCode = string2.hashCode();
                        if (hashCode != 684173810) {
                            if (hashCode == 905843021) {
                                if (string2.equals("vnd.android.cursor.item/photo") && z3) {
                                    try {
                                        contactModelV2.photoUri = query.getString(query.getColumnIndex("photo_thumb_uri"));
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        } else if (string2.equals("vnd.android.cursor.item/phone_v2")) {
                            String string3 = query.getString(query.getColumnIndex("data1"));
                            if (!TextUtils.isEmpty(string3)) {
                                String a2 = fx.a(string3);
                                List<String> list = contactModelV2.phoneNumber;
                                if (!list.contains(a2)) {
                                    list.add(a2);
                                }
                            }
                        }
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    i3++;
                }
            }
            Bundle extras = query.getExtras();
            if (Build.VERSION.SDK_INT < 21 || !extras.containsKey("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES") || !extras.containsKey("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS")) {
                iArr = null;
            } else {
                strArr = extras.getStringArray("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES");
                iArr = extras.getIntArray("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS");
                bdVar.f142667b = strArr;
                bdVar.f142668c = iArr;
            }
            int[] a3 = a(strArr, iArr);
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                ContactModelV2 contactModelV22 = (ContactModelV2) entry.getValue();
                if (a3 != null) {
                    int i5 = i2 + 1;
                    if (a3.length <= i5 || i4 < a3[i5]) {
                        contactModelV22.section = bdVar.f142667b[i2];
                    } else {
                        if (bdVar.f142667b.length > i5) {
                            contactModelV22.section = bdVar.f142667b[i5];
                        }
                        i2 = i5;
                    }
                }
                i4++;
                arrayList.add(contactModelV22);
            }
            bdVar.f142666a = arrayList;
            query.close();
            if (dVar != null) {
                if (i3 > 0) {
                    dVar.a(true, i3, e2);
                }
                dVar.a(true, bdVar.f142666a.size());
            }
            MethodCollector.o(11860);
            return bdVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0241, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x024d, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0252, code lost:
        r10 = r17 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0255, code lost:
        if (r1.length <= r10) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x025b, code lost:
        r5.section = r0.f142667b[r17];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x026b, code lost:
        if (r0.f142667b.length > r10) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x026d, code lost:
        r5.section = r0.f142667b[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0273, code lost:
        r17 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0289, code lost:
        r4 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0289 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:47:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x028c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.utils.bd a(android.content.Context r23, com.ss.android.ugc.aweme.social.monitor.d r24, java.lang.String r25, boolean r26, boolean r27, boolean r28) {
        /*
        // Method dump skipped, instructions count: 728
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.be.a(android.content.Context, com.ss.android.ugc.aweme.social.monitor.d, java.lang.String, boolean, boolean, boolean):com.ss.android.ugc.aweme.utils.bd");
    }
}
