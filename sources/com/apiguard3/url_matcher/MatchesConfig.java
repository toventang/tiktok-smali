package com.apiguard3.url_matcher;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import android.widget.ExpandableListView;
import com.apiguard3.internal.checkCertificates;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;

public class MatchesConfig {
    private static int getBody = 1;
    private static int getHeaders;
    private Matches AGRequest = Matches.getBody;
    private List<MatchConfig> getMethod = new ArrayList();

    static {
        Covode.recordClassIndex(2632);
    }

    public MatchesConfig() {
    }

    public List<MatchConfig> AGRequest() {
        boolean z;
        int i2 = getHeaders + 91;
        getBody = i2 % 128;
        if (i2 % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            List<MatchConfig> list = this.getMethod;
            int i3 = getBody + 9;
            getHeaders = i3 % 128;
            int i4 = i3 % 2;
            return list;
        }
        List<MatchConfig> list2 = this.getMethod;
        throw new NullPointerException("hashCode");
    }

    public Matches getMethod() {
        int i2 = getHeaders;
        int i3 = i2 + 113;
        getBody = i3 % 128;
        int i4 = i3 % 2;
        Matches matches = this.AGRequest;
        int i5 = i2 + 113;
        getBody = i5 % 128;
        if (i5 % 2 != 0) {
            return matches;
        }
        throw new NullPointerException("hashCode");
    }

    public int hashCode() {
        int hashCode;
        int i2 = getHeaders + 67;
        getBody = i2 % 128;
        if (i2 % 2 != 0) {
            hashCode = ((this.AGRequest.hashCode() + 527) * 31) + this.getMethod.hashCode();
        } else {
            hashCode = ((this.AGRequest.hashCode() + 12713) * 92) >>> this.getMethod.hashCode();
        }
        int i3 = getBody + 53;
        getHeaders = i3 % 128;
        if (i3 % 2 == 0) {
            return hashCode;
        }
        throw new NullPointerException("hashCode");
    }

    public enum Matches {
        AGRequest,
        getHeaders,
        getMethod,
        getBody;
        
        private static int AGRequest$Builder = 0;
        private static int method;
        private static int url;

        static void getUrl() {
            method = 15;
        }

        static {
            Covode.recordClassIndex(2633);
            url = 1;
            getUrl();
            int i2 = AGRequest$Builder + 119;
            url = i2 % 128;
            int i3 = i2 % 2;
        }

        public static Matches valueOf(String str) {
            int i2 = url + 7;
            AGRequest$Builder = i2 % 128;
            int i3 = i2 % 2;
            Matches matches = (Matches) Enum.valueOf(Matches.class, str);
            int i4 = AGRequest$Builder + 27;
            url = i4 % 128;
            int i5 = i4 % 2;
            return matches;
        }

        public static Matches getMethod(String str) {
            int i2 = url + 91;
            AGRequest$Builder = i2 % 128;
            int i3 = i2 % 2;
            switch (str.hashCode()) {
                case 64897:
                    if (str.equals(getMethod(!PhoneNumberUtils.is12Key('0'), "\u0004￹\u0004", 87 - Color.blue(0), 3 - (Process.myTid() >> 22), (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1))).intern())) {
                        int i4 = AGRequest$Builder + 47;
                        url = i4 % 128;
                        int i5 = i4 % 2;
                        return AGRequest;
                    }
                    break;
                case 64972:
                    if (str.equals(getMethod(URLUtil.isDataUrl("data:"), "\f\u0001￴", TextUtils.getOffsetAfter("", 0) + 92, TextUtils.getCapsMode("", 0, 0) + 3, 3 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                        int i6 = AGRequest$Builder + 69;
                        url = i6 % 128;
                        int i7 = i6 % 2;
                        return getHeaders;
                    }
                    break;
                case 2402104:
                    if (str.equals(getMethod(!PhoneNumberUtils.isStartsPostDial('0'), "\u0002￹\u0002\u0003", 91 - KeyEvent.getDeadChar(0, 0), 4 - TextUtils.getOffsetAfter("", 0), TextUtils.getOffsetBefore("", 0) + 1).intern())) {
                        int i8 = AGRequest$Builder + 81;
                        url = i8 % 128;
                        int i9 = i8 % 2;
                        return getMethod;
                    }
                    break;
                case 452152962:
                    if (str.equals(getMethod(Process.supportsProcesses(), "￼\b\r\u0002￵￻\u0002�", 91 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7, 5 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))).intern())) {
                        return getBody;
                    }
                    break;
            }
            checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.values);
            return getBody;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v1, types: [char[]] */
        /* JADX WARN: Type inference failed for: r6v2 */
        private static String getMethod(boolean z, String str, int i2, int i3, int i4) {
            if (str != 0) {
                int i5 = AGRequest$Builder + 3;
                url = i5 % 128;
                int i6 = i5 % 2;
                str = str.toCharArray();
            }
            char[] cArr = (char[]) str;
            char[] cArr2 = new char[i3];
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = AGRequest$Builder + 23;
                url = i8 % 128;
                int i9 = i8 % 2;
                cArr2[i7] = (char) (cArr[i7] + i2);
                cArr2[i7] = (char) (cArr2[i7] - method);
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                int i10 = i3 - i4;
                System.arraycopy(cArr3, 0, cArr2, i10, i4);
                System.arraycopy(cArr3, i4, cArr2, 0, i10);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                int i11 = url + 89;
                AGRequest$Builder = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 0;
                while (i13 < i3) {
                    int i14 = AGRequest$Builder + 23;
                    url = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr4[i13] = cArr2[(i3 - i13) - 1];
                        i13++;
                    } else {
                        cArr4[i13] = cArr2[(i3 % i13) + 0];
                        i13 += 32;
                    }
                }
                cArr2 = cArr4;
            }
            return new String(cArr2);
        }
    }

    public MatchesConfig(JSONArray jSONArray) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            String str = (String) jSONArray.opt(0);
            if (str == null || str.isEmpty()) {
                this.AGRequest = Matches.getBody;
            } else {
                this.AGRequest = Matches.getMethod(str);
            }
            if (this.AGRequest == Matches.getBody) {
                this.getMethod = Collections.emptyList();
                return;
            }
            for (int i2 = 1; i2 < jSONArray.length(); i2++) {
                JSONArray jSONArray2 = (JSONArray) jSONArray.opt(i2);
                if (jSONArray2 != null) {
                    this.getMethod.add(new MatchConfig(jSONArray2));
                }
            }
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        int i2 = getHeaders;
        int i3 = i2 + 87;
        getBody = i3 % 128;
        int i4 = i3 % 2;
        if (this != obj) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (obj != null && getClass() == obj.getClass()) {
                MatchesConfig matchesConfig = (MatchesConfig) obj;
                if (this.AGRequest.equals(matchesConfig.AGRequest)) {
                    int i5 = getBody + 49;
                    getHeaders = i5 % 128;
                    if (i5 % 2 != 0 ? this.getMethod.equals(matchesConfig.getMethod) : this.getMethod.equals(matchesConfig.getMethod)) {
                        return true;
                    }
                }
                int i6 = getBody + 97;
                getHeaders = i6 % 128;
                int i7 = i6 % 2;
            }
            return false;
        }
        int i8 = i2 + 21;
        getBody = i8 % 128;
        if (i8 % 2 != 0) {
            return true;
        }
        return false;
    }
}
