package com.ss.ttvideoengine;

import android.text.TextUtils;
import com.a;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.networkpredictor.ISpeedPredictor;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorRecordOld;
import com.bytedance.vcloud.networkpredictor.SpeedPredictorResultCollection;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.j.o;
import com.ss.ttvideoengine.s.j;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class ai implements at {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<aj> f152197a;

    /* renamed from: b  reason: collision with root package name */
    private ISpeedPredictor f152198b;

    /* renamed from: c  reason: collision with root package name */
    private long f152199c;

    /* renamed from: d  reason: collision with root package name */
    private ISpeedPredictor f152200d;

    static {
        Covode.recordClassIndex(101454);
    }

    private Map<String, Integer> a() {
        e eVar;
        List<o> b2;
        aj ajVar = this.f152197a.get();
        if (ajVar == null || (eVar = ajVar.ad) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (eVar.a() && (b2 = eVar.b()) != null && b2.size() > 0) {
            for (o oVar : b2) {
                hashMap.put(oVar.b(15), Integer.valueOf(oVar.a()));
            }
        }
        return hashMap;
    }

    private static String c(String str) {
        if (str == null || str.length() <= 0) {
            return "unknown";
        }
        try {
            return new JSONObject(str).optString("protocol");
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static long b(String str) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        try {
            try {
                return Long.parseLong(new JSONObject(str).optJSONObject("tcpInfo").optString("tcpRtt"));
            } catch (NumberFormatException unused) {
                return 0;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private void a(Map<String, Integer> map) {
        aj ajVar = this.f152197a.get();
        if (ajVar != null && map != null) {
            long m2 = ajVar.m(62);
            long m3 = ajVar.m(61);
            int l2 = ajVar.l(0) * 1000;
            int l3 = ajVar.l(0) * 1000;
            map.put("playerVideoBufLen", Integer.valueOf((int) m2));
            map.put("playerAudioBufLen", Integer.valueOf((int) m3));
            map.put("playerVideoMaxBufLen", Integer.valueOf(l2));
            map.put("playerAudioMaxBufLen", Integer.valueOf(l3));
        }
    }

    @Override // com.ss.ttvideoengine.at
    public final void a(String str) {
        j.b("TTVideoEngine", a.a(Locale.US, "speed notify, what:%d, info:%s", new Object[]{2, str}));
        aj ajVar = this.f152197a.get();
        if (ajVar != null) {
            ajVar.ae.A(str);
            ISpeedPredictor iSpeedPredictor = this.f152200d;
            if (iSpeedPredictor != null && aj.cf == 2) {
                Map<String, Integer> a2 = a();
                a(a2);
                iSpeedPredictor.update(str, a2);
                if (str != null) {
                    j.b("TTVideoEngine", a.a(Locale.US, "[ABR]: speedRecordsJson:%s", new Object[]{str}));
                }
                ajVar.bP++;
                Map<String, String> downloadSpeed = iSpeedPredictor.getDownloadSpeed(0);
                float predictSpeed = iSpeedPredictor.getPredictSpeed(0);
                Map<String, String> downloadSpeed2 = iSpeedPredictor.getDownloadSpeed(1);
                float predictSpeed2 = iSpeedPredictor.getPredictSpeed(1);
                StringBuffer stringBuffer = new StringBuffer(" ");
                StringBuffer stringBuffer2 = new StringBuffer(" ");
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                float a3 = a(downloadSpeed, stringBuffer, hashMap);
                float a4 = a(downloadSpeed2, stringBuffer2, hashMap2);
                if (a3 > 0.0f && ajVar.bP > 0) {
                    ajVar.bN += (a3 - ajVar.bN) / ((float) ajVar.bP);
                }
                if (predictSpeed > 0.0f && ajVar.bP > 0) {
                    ajVar.bO += (predictSpeed - ajVar.bO) / ((float) ajVar.bP);
                }
                SpeedPredictorResultCollection multidimensionalDownloadSpeedsObj = iSpeedPredictor.getMultidimensionalDownloadSpeedsObj();
                SpeedPredictorResultCollection multidimensionalPredictSpeedsObj = iSpeedPredictor.getMultidimensionalPredictSpeedsObj();
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = this.f152199c;
                long j3 = currentTimeMillis - j2;
                if (j2 == 0) {
                    j3 = 0;
                }
                this.f152199c = currentTimeMillis;
                if (ajVar.l(525) == 0) {
                    j.b("TTVideoEngine", a.a(Locale.US, "[SPEEDPREDICT] use sing predictor data outing", new Object[0]));
                    ajVar.ae.a(stringBuffer.toString(), stringBuffer2.toString(), a3, a4, predictSpeed, predictSpeed2, j3, hashMap, hashMap2);
                    ajVar.ae.O(0);
                } else if (ajVar.l(525) == 1) {
                    j.b("TTVideoEngine", a.a(Locale.US, "[SPEEDPREDICT] use multi data outing", new Object[0]));
                    if (!(multidimensionalPredictSpeedsObj == null || multidimensionalPredictSpeedsObj.getResultCollection() == null || multidimensionalPredictSpeedsObj.getResultCollection().isEmpty())) {
                        ajVar.ae.a(multidimensionalDownloadSpeedsObj, multidimensionalPredictSpeedsObj, j3);
                    }
                    ajVar.ae.O(1);
                }
                ajVar.ae.P(2);
            }
        }
    }

    private static long a(String str, String str2) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        try {
            try {
                return Long.parseLong(new JSONObject(str).optJSONObject("tcpInfo").optString(str2));
            } catch (NumberFormatException unused) {
                return 0;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    ai(aj ajVar, ISpeedPredictor iSpeedPredictor, ISpeedPredictor iSpeedPredictor2) {
        this.f152197a = new WeakReference<>(ajVar);
        this.f152198b = iSpeedPredictor;
        this.f152200d = iSpeedPredictor2;
    }

    private static float a(Map<String, String> map, StringBuffer stringBuffer, Map<String, String> map2) {
        float f2;
        if (!(map == null || map.size() <= 1 || map.get("download_speed") == null)) {
            try {
                f2 = Float.parseFloat(map.get("download_speed"));
            } catch (NumberFormatException e2) {
                j.e("TTVideoEngine", a.a(Locale.US, "[SPEEDPREDICT] exception %s", new Object[]{e2.toString()}));
                f2 = 0.0f;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!entry.getKey().equals("stream_id") && !entry.getKey().equals("download_speed")) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
            if (!map.get("stream_id").equals("-1")) {
                stringBuffer.delete(0, stringBuffer.capacity()).append(map.get("stream_id"));
                return f2;
            }
        }
        return 0.0f;
    }

    @Override // com.ss.ttvideoengine.at
    public final void a(long j2, long j3, String str, String str2, String str3) {
        int i2;
        j.b("TTVideoEngine", a.a(Locale.US, "speed notify, what:%d, code:%d, para:%d, inf:%s, extraInfoJsonStr:%s", new Object[]{2, Long.valueOf(j2), Long.valueOf(j3), str, str3}));
        aj ajVar = this.f152197a.get();
        if (ajVar != null) {
            ajVar.ae.b(j2, j3);
            ISpeedPredictor iSpeedPredictor = this.f152200d;
            if (iSpeedPredictor != null) {
                SpeedPredictorRecordOld speedPredictorRecordOld = new SpeedPredictorRecordOld();
                speedPredictorRecordOld.setSteamId(str);
                speedPredictorRecordOld.setBytes(j2);
                speedPredictorRecordOld.setTime(j3);
                long b2 = b(str3);
                long a2 = a(str3, "tcpLastRecvDate");
                speedPredictorRecordOld.setTcpInfoRtt(b2);
                speedPredictorRecordOld.setLastRecvDate(a2);
                speedPredictorRecordOld.setProtocol(c(str3));
                if (TextUtils.isEmpty(str2) || !str2.equals(DataType.AUDIO)) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                speedPredictorRecordOld.setTrackType(i2 ^ 1);
                speedPredictorRecordOld.setTimestamp(System.currentTimeMillis());
                if (speedPredictorRecordOld.getTime() != 0) {
                    DecimalFormat decimalFormat = new DecimalFormat("#.000000000");
                    double bytes = (double) speedPredictorRecordOld.getBytes();
                    double time = (double) speedPredictorRecordOld.getTime();
                    Double.isNaN(bytes);
                    Double.isNaN(time);
                    j.b("TTVideoEngine", a.a(Locale.US, "[ABR]: speedRecord:%s", new Object[]{decimalFormat.format(bytes / time)}));
                }
                Map<String, Integer> a3 = a();
                a(a3);
                iSpeedPredictor.update(speedPredictorRecordOld, a3);
                ajVar.bP++;
                Map<String, String> downloadSpeed = iSpeedPredictor.getDownloadSpeed(0);
                float predictSpeed = iSpeedPredictor.getPredictSpeed(0);
                Map<String, String> downloadSpeed2 = iSpeedPredictor.getDownloadSpeed(1);
                float predictSpeed2 = iSpeedPredictor.getPredictSpeed(1);
                StringBuffer stringBuffer = new StringBuffer(" ");
                StringBuffer stringBuffer2 = new StringBuffer(" ");
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                float a4 = a(downloadSpeed, stringBuffer, hashMap);
                float a5 = a(downloadSpeed2, stringBuffer2, hashMap2);
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = this.f152199c;
                long j5 = currentTimeMillis - j4;
                if (j4 == 0) {
                    j5 = 0;
                }
                this.f152199c = currentTimeMillis;
                if (a4 > 0.0f && ajVar.bP > 0) {
                    ajVar.bN += (a4 - ajVar.bN) / ((float) ajVar.bP);
                }
                if (predictSpeed > 0.0f && ajVar.bP > 0) {
                    ajVar.bO += (predictSpeed - ajVar.bO) / ((float) ajVar.bP);
                }
                ajVar.ae.a(stringBuffer.toString(), stringBuffer2.toString(), a4, a5, predictSpeed, predictSpeed2, j5, hashMap, hashMap2);
                ajVar.ae.P(1);
                ajVar.ae.O(0);
            }
        }
    }
}
