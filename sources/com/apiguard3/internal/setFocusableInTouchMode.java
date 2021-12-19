package com.apiguard3.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.apiguard3.internal.setAutofillHints;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

public final class setFocusableInTouchMode extends setHasTransientState {
    private static final long[] AGRequest;
    private static final String[] AGRequest$Builder;
    private static char[] AGResponse;
    private static int AGResponse$Builder = 1;
    private static int AGState = 1;
    private static final String[] addHeader;
    private static long build = -4892316785303982051L;
    private static getBody delete;
    private static getBody get;
    private static final long[] getBody = {221583250};
    private static final long[] getHeaders;
    private static final long[] getMethod = {472001035, -601740789};
    private static getBody getStatusCode;
    private static final long[] getUrl;
    private static getBody head;
    private static setAutofillHints.getBody headers = new setAutofillHints.getBody();
    private static getBody headersMultiMap;
    private static final long[] method;
    private static final long[] newBuilder;
    private static final long[] post;
    private static getBody put;
    private static int statusCode;
    private static final long[] url;
    private static int values;

    private static native long a(int i2);

    private static Object com_apiguard3_internal_setFocusableInTouchMode_java_lang_reflect_Method_invoke(Method method2, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method2, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_apiguard3_internal_setFocusableInTouchMode_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method2.invoke(obj, objArr);
        a.a(invoke, method2, new Object[]{obj, objArr}, "com_apiguard3_internal_setFocusableInTouchMode_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00da, code lost:
        if (r9 == 7910848591899845890L) goto L_0x00ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getHeaders(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFocusableInTouchMode.getHeaders(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0083, code lost:
        if (r10.contains(getBody((char) ((r1 & 57366) + (r1 | 57366)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 49, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 6)) == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0124, code lost:
        if ((r1 % 2) == 0) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMethod(java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 414
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFocusableInTouchMode.getMethod(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0289  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized int getHeaders(int r18, com.apiguard3.internal.setFocusableInTouchMode.getBody[] r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 874
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFocusableInTouchMode.getHeaders(int, com.apiguard3.internal.setFocusableInTouchMode$getBody[], boolean):int");
    }

    static {
        Covode.recordClassIndex(2591);
        values = 0;
        statusCode = 0;
        char[] cArr = new char[1317];
        ByteBuffer.wrap("\u0000RpràUP#ÀT0å Ë\u0010¸ñ%a\u000fÑ\u001fA/±\u001a!÷Ý\u0001ðqâkRDÂ/2\u0000¢\u0019\u0012þË\u0000MpXànP\u0016ÀY0Ø à\u0010ÇñHacÑqA\u0015±?!Óà\u0001qÃâGRa\u0000cpràWPyàqd\u0000C°& \u000eÐâ¶\u0012Æ\u0000V-æVvh\u0016¹\u0000/pyà[P#À\u00150¾ Ï\u0010»ñ*\u0000RpràUP#ÀT0å Ë\u0010¸ñ%a\u000fÑ\u001fA/±\u001a!÷Ý\u0001ðqâkRDÂ/2\u0000¢\u0019\u0012þËòõbßÓ/C_³%#\tô\u0000pppà\u001aP;À\u001d0â Ú\u0010ëñdaAÑTA=±\u001e!óÀ\u0001ðqÀâl\u0000\n\u0000pp|àYP<À\u00150ö Ë\u0010ñ\u0000cpràWPyÀ\u00130þ Á\u0010¬ñ`a\fâap\u0002U²{\"\u0017ÒýBÈò»b\u0013nD3\u0013.^²Î~¹îû\u001e\u000f+>%®@ß¤Oÿoöºë{½ËË[¼«\r;#P\u001btjÍúçJ÷ÚÇ*òº\u001f\n5\u0018êuyÉ¬YÇ©è9ñ\u0016\u0019#i\u001dù7HÇØ¢(À¸ý\b\u001f\u0000apsà^P%À\u001b0ø Ê\u0010åñjaLÑKA9±\u0017!â\u0001qâdRSÂ!2\u0019¢\n ÔÐË@ýð´`¦A\u0000v°\u0019 <QÓÁÜqíá\u0011«B1e¡\u0011\u0000apsà^P%À\u001b0ø Ê\u0010åñjaLÑKA9±\u0017!â\u0001 qâ$RwÂ%2\u0002¢\u0015\u0012úßò°b¿ÓnCB³(#\u0001æ\u0003Ò\u0000gpxàNP\u001eÀ\u001a0â Ú\u0010ªñiaGÑ[A\u001d±\t!æß\u0001¹qâkRSÂ-2\u000e¢\u0010\u0012è\\7,%¼\b\fsMl®üL³ÜÝ­<=\u001a\u001d\u001doíA}´ÍË]ö-Ö¾r\u000e0bnGþDN¤Þ®â>Ð0\u001f\u0015ïqyÏ»_/\u0015°e¢õE÷ÕÔ%\fµ\u001c\u0005u^$#TqÄt\bä0\u0014ß¤4¬¤£ÕHEaõfe\u001d\u001e\u0005Ýµ÷%U ÆEvæN\u0016(86Ð¦áÖF÷Dgk\u0006Pö ä°É\u0000²`oð]@rÐ\u0016¡ü1ÁÍ\u0011¥áq/ÁEQ$!\u000e²ô\u0002ß½bØò¤BMÒf¢\fåyY\u0005~µ\b%ÕÎEàõe·\u0014\u000e$44¤\u0014T:ÄØtûäæ\u0007H·b'\u001c×>G4÷Ügÿ\u0017½6\u0004¦fV\u0012Æ=vÄæâõ\u0006¶¨!VÑuA\u000bñ3a\u0011ú1Ô¡¤PWÀxpXà2À\u0000¡°¡ ®ÓMC\u0015ó]c\u0012\u00130Ø3ã£S°Â\rraâ\u0018V\u00028²Ò\"ìÒB¤ýLmo\u001d\u000b-\u0000RpràUP#ÀT0å Ë\u0010¸ñ%a\u000fÑ\u001fA9±\u0001!óÐ\u0001¥qâoR\u0007Â72\u0014¢P\u001a~jeú\u0017JwÚ\u001a*¼ºÊ\n¢\u0000rpràUP#bÍ\u00122ý¢ÑR2Â\u000frkâ\fµ\u0003³Û#ýÓÅC7ó\u0014c4\u0013\u000e½0 §\u0000RpràUP#ÀT0å Ë\u0010¸ñ%a\u000fÑ\u001fA?±\u0011!óÐ\u0001»qÍâlRHÂ62A¢\r\u0012îò±bÓ/CE³'#Fî\u0003ÏsÈã´SÄg4\u001fWh'p·B\u0007:\u001agü÷ÑG¢×¦&6]F\u0016~æ\u0011vø\u0000\tp[àUP\"À\u001a0õ \u0010ìñpa\fÑ[A>±^!¶Ú\u0001¾qÍâgRHÂ12\u000f¢\n\u0012»ÛòºbÓbCM³'#\u0002£\u0003ÏsÈã®SÄa4E¤=\u0000/pmàHP8À\u00170¾ Ã\u0010¤ñkaVÑLàÙp×À P w0\fn\u0010\u0019aòñAÙÑ¼!Ü±4\u0001X<áOr§ÂÕR´¢26\u0012Wb8ò\u0005CãÓÚ#¸$MTmÄJt<äK\u0014úÔ4§¤Õ:E\u0010õ\u0000e \u000e\u0005ìµÏ%¤UÒÆsvWæ)\u0016^\u00166ö¦ÎÖ¾F÷qgQ:\u0007\u001c·¼'ÒWÍÇ°wà\u0010] \u000b\u0000 poàM\u0000\tp[àUP\"À\u001a0õ \u0010¼ñlaVÑ^A>±\u0015!ó\u0001¼qâiRFÂ02\b¢\u0011\u0012õò-áfª\u0016­6Û¦¬V\u001dÆ3v@ædÝ\u0007÷·ç'Ô×óG\u0001÷(gM\u0017f4ÿ¤ÏTúÄçt\rän[è+È»ï\u000bîk_ûqK\u0002Û&ª:µ¥\u001aê¦zMÊ{Z\t*?¹\tÿiµù¥ISÙ{©T9h\u0000\t\u0000 p{àUP\"À\u001a0õ 1ûAÛÑüañý\u0001Lb!\u0011±5ÀP¦à¶p¶\u0010\u001f H0\u0016@+Ó×c®ó¾\u0003­£#F³xÃ\u0012S<âÕ«7Û%K\bûskM®\u000b»³+ÑZ ÊZz:ês\u001a\\´:ªëÚëI.ù\u001eibR\tZ¹¹)YæÉ×WÖ'É·ÿ\u0007¯«gT\u0000ppxàHP$À\u001d0â Ú\u0010åñ|aQÑ\u0011A.±\u0016!ùÇ\u0001qâiRDÂ!2\u0012¢\r¯ÔßËOý8\u0014H\u000eØ.h^ø'\b¥(Õ¸»É\u000bY*é\u001dyEe\u0019©£9ÂIþ\u0000apàIP2À\u001a0åÖ}¦g6[6\u0016\u0012æðvÆòíû\u0012Ñ¢º2Â?RMâ*r\u0013\u0003åØ#Âû â\u001bÇ«·;Ë1[Rë!{\u000b\nì*Ýº¼JÚwjHú,êne\nKº,*IÚáJÜú£j\u001blL;\u0002«\"[\u000bËå{Úë¬\by¸I(yØ\u0011H\u0002øáh\u0018 9a©YY1É\bûG\u0005\u001b «P;ËÙ[¯ëÐ{ \n\u0000%*\"ºZJeÚj¿úò\u0019\u000b©;9DÉ)Y~éy´\tØê(\u000e¸ H\u001cØ<\u0000/pmàHP8À\u00170¾\u0000/ppàUP\"À\u001a0å Ý29B&Ò\u001bbmòT\u0002¶Ú\"ü²ÓÃ?S\u0002ã\nsaC\u0013±£Ç3éCØÐ9`Sðx\u0000TY §°Àò\u0000/pnàCP$À[0÷ Ý\u0010äñ`aNÑVA2±\f!î\u0001 qâfRNÂ'2\u0018÷çõwÑÇ¹W§o7\t*\u0017\u0006fîöÀFÖ¸&¶\u0006@6æ\u0003uãÅÓUã¥5{\u0015\u001fe:õ\u0014DûÔÃ$«´b»\u0012¤2ï¢Ö\u0000sph®LÞ\u001aN8þ@nvÝ\u000e¡¾Ç.è_\u0007Ï-s\u0000/pyà[P#À\u00150¾ Â\u0010¤ñdaNÑ\u0010A>±\u0010!ø\u0000/pyà[P#À\u00150¾ Â\u0010¤ñdaNÑ\u0010A$±\u001b!ÿÝ\u0001ÿ\u0000/pnàXP>À\u001a0¾ þanLÞ+N\u000f¾û.Ìë\u000ecïC_\u001f\u0000/pnàCP$À\u00000ô Ã\u0010äñlaLÑ\u0010Ar±\u001c!îÇ\u0001ÿ\u0017\u001cg]÷pG\u0017×3'Ç·ð\u0007×¹æ_vÆ#V\t¦+6Ìì\u0016f¿õ_EqÕX\u0000/pnàCP$À\u00000ô Ã\u0010äñaa\rÑGA>±\u0010!ø\u0000/pnàCP$À\u00000ô Ã\u0010äñvaPÑ\u0010A+±\u001c!»Ý\u0001µqânR\nÂ62\u000e¢\u0011\u0012ïÚNª\u000f:\"E\u001aaêz¢ÊZñ+\u0006»*\u000b0\u0012øÐhýØH¾¸J(}\u0000/pnàCP$À\u00000ô Ã\u0010äñlaL\u0000/pnàCP$À\u00000ô Ã\u0010äñgaKÑQç_\u001e\u00073·T'p×G³÷gà\u0016\u0017;6!\u0000/pkà_P9À\u00100þ Ü\u0010äñlaL\u0000/pnàXP>À\u001aÒ+¢|2J0".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1317);
        AGResponse = cArr;
        long[] jArr = {5346983579176056341L, 2009081199365669074L, 5956613504184305173L, 8899588629242527954L, 375079373922271629L, 1599531319238017234L, 5109561905117738517L, 2755552837602328786L};
        getHeaders = jArr;
        long[] jArr2 = {-8080523676569222304L, 6247535792709053186L, -7821137391702040246L, -3922916112654851522L, 8839175558035598718L, -2890535829032981914L, 4113801434712603158L, 5835755100867204884L};
        AGRequest = jArr2;
        long[] jArr3 = {4085212954298587426L, 3012439845812021669L, 5769587637170450507L, 2969396325011468692L, 7867099544161923476L, 1598132056504805899L};
        getUrl = jArr3;
        long[] jArr4 = {2018191094461008829L, -3135287916255501627L, -6543530224906774004L, 6873030840008565331L, 3232606552312898193L, 6330987359265341719L};
        method = jArr4;
        long[] jArr5 = {1312179212427599182L, 8085699055651459282L, 6329818986207784146L, 7581214046858337288L, 222271138232253650L, 1524944220437646053L};
        newBuilder = jArr5;
        long[] jArr6 = {2414330307756640011L, -3593916909785094185L, 7092956718875610598L, -5964681408332242700L, 8518732971232906945L, -3109682652025013662L};
        url = jArr6;
        int scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
        char c2 = (char) (((scrollDefaultDelay | 44643) << 1) - (scrollDefaultDelay ^ 44643));
        int makeMeasureSpec = 1100 - View.MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = -Color.blue(0);
        int i3 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
        char c3 = (char) ((i3 & -1) + (i3 | -1));
        int i4 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1111;
        int i5 = -TextUtils.getOffsetBefore("", 0);
        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
        int i6 = -(Process.myPid() >> 22);
        int i7 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
        int i8 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        int i9 = -(Process.myPid() >> 22);
        char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        int i10 = -TextUtils.lastIndexOf("", '0', 0, 0);
        char trimmedLength = (char) TextUtils.getTrimmedLength("");
        int i11 = -(-(ViewConfiguration.getFadingEdgeLength() >> 16));
        int i12 = (i11 & 1201) + (i11 | 1201);
        int i13 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
        int i14 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
        int i15 = -(-ExpandableListView.getPackedPositionChild(0));
        int i16 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
        int i17 = -KeyEvent.getDeadChar(0, 0);
        addHeader = new String[]{getBody(c2, makeMeasureSpec, (i2 & 12) + (i2 | 12)), getBody(c3, i4, (i5 & 16) + (i5 | 16)), getBody(longPressTimeout, (i6 & 1128) + (i6 | 1128), 17 - (ViewConfiguration.getScrollBarSize() >> 8)), getBody((char) ((i7 & -1) + (i7 | -1)), (1145 - ((-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))) ^ -1)) - 1, (i8 & 5) + (i8 | 5)), getBody((char) ((36367 - (Color.red(0) ^ -1)) - 1), (1151 - ((-View.getDefaultSize(0, 0)) ^ -1)) - 1, ((i9 | 12) << 1) - (i9 ^ 12)), getBody(c4, ((i10 | 1162) << 1) - (i10 ^ 1162), 17 - View.resolveSize(0, 0)), getBody((char) ((5939 - (ExpandableListView.getPackedPositionGroup(0) ^ -1)) - 1), 1180 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 21 - TextUtils.indexOf("", "")), getBody(trimmedLength, i12, ((i13 | 16) << 1) - (i13 ^ 16)), getBody(edgeSlop, (i14 & 1217) + (i14 | 1217), 25 - (ViewConfiguration.getFadingEdgeLength() >> 16)), getBody((char) ((i15 & 55906) + (i15 | 55906)), (i16 ^ 1242) + ((i16 & 1242) << 1), (i17 & 13) + (i17 | 13))};
        int i18 = -(Process.myPid() >> 22);
        int i19 = -TextUtils.indexOf("", "", 0, 0);
        char c5 = (char) ((59248 - ((-Color.red(0)) ^ -1)) - 1);
        int edgeSlop2 = ViewConfiguration.getEdgeSlop() >> 16;
        int i20 = (edgeSlop2 ^ 1285) + ((edgeSlop2 & 1285) << 1);
        int i21 = -(SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1));
        int threadPriority = Process.getThreadPriority(0);
        int i22 = -TextUtils.lastIndexOf("", '0');
        int i23 = -(Process.myTid() >> 22);
        int i24 = -(-(SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)));
        int i25 = -(-TextUtils.indexOf((CharSequence) "", '0', 0, 0));
        AGRequest$Builder = new String[]{getBody((char) ((i18 ^ 35006) + ((i18 & 35006) << 1)), 1255 - TextUtils.getCapsMode("", 0, 0), 7 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))), getBody((char) View.getDefaultSize(0, 0), (1261 - ((-TextUtils.lastIndexOf("", '0', 0)) ^ -1)) - 1, (i19 & 11) + (i19 | 11)), getBody((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1273, (Process.myTid() >> 22) + 12), getBody(c5, i20, (i21 ^ 13) + ((i21 & 13) << 1)), getBody((char) View.MeasureSpec.makeMeasureSpec(0, 0), (1298 - ((-(ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))) ^ -1)) - 1, ((((threadPriority | 20) << 1) - (threadPriority ^ 20)) >> 6) + 11), getBody((char) ((i22 ^ -1) + ((i22 & -1) << 1)), (1308 - ((-Drawable.resolveOpacity(0, 0)) ^ -1)) - 1, ((i23 | 5) << 1) - (i23 ^ 5)), getBody((char) ((i24 & 53763) + (i24 | 53763)), (1313 - ((-TextUtils.getTrimmedLength("")) ^ -1)) - 1, (i25 & 5) + (i25 | 5))};
        long[] jArr7 = {216413717};
        post = jArr7;
        put = new getBody(40, jArr4, 0, 0);
        get = new getBody(20, jArr2, 0, 0);
        delete = new getBody(60, jArr6, 0, 0);
        head = new getBody(40, jArr3, 5, Long.MAX_VALUE);
        headersMultiMap = new getBody(20, jArr, 5, Long.MAX_VALUE);
        new getBody(60, jArr5, 5, Long.MAX_VALUE);
        getStatusCode = new getBody(150, jArr7, 5, 1073741823);
        int i26 = AGResponse$Builder;
        int i27 = (i26 & 99) + (i26 | 99);
        statusCode = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = AGState + 103;
            values = i28 % 128;
            int i29 = i28 % 2;
            return;
        }
        int i30 = AGState + 35;
        values = i30 % 128;
        if (i30 % 2 != 0) {
            throw new NullPointerException("hashCode");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        if ((r1 - 3) == 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if ((r1 % 2) != 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getMethod(android.content.Context r4) {
        /*
            int r3 = com.apiguard3.internal.setFocusableInTouchMode.AGState
            int r1 = r3 + 123
            int r0 = r1 % 128
            com.apiguard3.internal.setFocusableInTouchMode.values = r0
            int r1 = r1 % 2
            r0 = 89
            if (r1 != 0) goto L_0x004d
            int r2 = com.apiguard3.internal.setFocusableInTouchMode.AGResponse$Builder
            r0 = r2 | 113(0x71, float:1.58E-43)
            int r1 = r0 << 1
            r0 = r2 ^ 113(0x71, float:1.58E-43)
            int r1 = r1 - r0
            int r0 = r1 % 128
            com.apiguard3.internal.setFocusableInTouchMode.statusCode = r0
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x0027
        L_0x001f:
            int r1 = r3 + 65
            int r0 = r1 % 128
            com.apiguard3.internal.setFocusableInTouchMode.values = r0
            int r0 = r1 % 2
        L_0x0027:
            r0 = 17
            int r3 = getMethod(r4, r0)
            int r0 = com.apiguard3.internal.setFocusableInTouchMode.statusCode
            int r1 = r0 + 19
            int r0 = r1 % 128
            com.apiguard3.internal.setFocusableInTouchMode.AGResponse$Builder = r0
            int r0 = r1 % 2
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            return r3
        L_0x003a:
            int r2 = com.apiguard3.internal.setFocusableInTouchMode.values
            int r1 = r2 + 39
            int r0 = r1 % 128
            com.apiguard3.internal.setFocusableInTouchMode.AGState = r0
            int r0 = r1 % 2
            int r1 = r2 + 69
            int r0 = r1 % 128
            com.apiguard3.internal.setFocusableInTouchMode.AGState = r0
            int r0 = r1 % 2
            goto L_0x0039
        L_0x004d:
            int r0 = com.apiguard3.internal.setFocusableInTouchMode.AGResponse$Builder
            r0 = r0 ^ 105(0x69, float:1.47E-43)
            int r1 = r0 / 0
            int r1 = r1 % r0
            r0 = 22081(0x5641, float:3.0942E-41)
            int r0 = r1 >> r0
            com.apiguard3.internal.setFocusableInTouchMode.statusCode = r0
            int r0 = r1 + -3
            if (r0 != 0) goto L_0x001f
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFocusableInTouchMode.getMethod(android.content.Context):int");
    }

    /* access modifiers changed from: package-private */
    public static class getBody {
        private static int AGRequest$Builder = 1;
        private static int addHeader;
        private static int getMethod = 0;
        private static int method = 1;
        private long AGRequest;
        private int getBody;
        private long[] getHeaders;
        private int getUrl;

        static {
            Covode.recordClassIndex(2593);
            addHeader = 0;
            addHeader = 24;
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00f5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int getUrl(java.lang.String r15) {
            /*
            // Method dump skipped, instructions count: 394
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFocusableInTouchMode.getBody.getUrl(java.lang.String):int");
        }

        getBody(int i2, long[] jArr, int i3, long j2) {
            this.getUrl = i2;
            this.getHeaders = jArr;
            this.getBody = i3;
            this.AGRequest = j2;
        }
    }

    private static int getBody(int i2) {
        int i3 = AGResponse$Builder + 115;
        statusCode = i3 % 128;
        int i4 = i3 % 2;
        char indexOf = (char) TextUtils.indexOf("", "");
        int i5 = -(Process.myPid() >> 22);
        getBody(indexOf, ((i5 | 472) << 1) - (i5 ^ 472), 23 - TextUtils.indexOf("", "", 0));
        try {
            int i6 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
            int i7 = -TextUtils.indexOf("", "", 0);
            if (setAutofillHints.getBody(getBody((char) ((i6 ^ 6669) + ((i6 & 6669) << 1)), (495 - ((-(Process.myTid() >> 22)) ^ -1)) - 1, (i7 & 8) + (i7 | 8)), true, -1, headers).contains(getBody((char) (KeyEvent.getMaxKeyCode() >> 16), (503 - ((-(ViewConfiguration.getEdgeSlop() >> 16)) ^ -1)) - 1, 4 - (ViewConfiguration.getDoubleTapTimeout() >> 16)))) {
                int i8 = AGResponse$Builder + 75;
                statusCode = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = values + 65;
                    AGState = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = -TextUtils.lastIndexOf("", '0');
                        int i11 = -(ViewConfiguration.getTapTimeout() >> 16);
                        getBody((char) ((i10 ^ 25283) + ((i10 & 25283) << 1)), (i11 & 507) + (i11 | 507), 21 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        i2 = ((i2 ^ -1) & 80) | (i2 & -81);
                        int i12 = statusCode + 63;
                        AGResponse$Builder = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
                getBody((char) (TextUtils.lastIndexOf("", '.') * 17299), 29991 % (ViewConfiguration.getTapTimeout() * 92), (ViewConfiguration.getDoubleTapTimeout() * 55) + 102);
                i2 |= 6;
                int i122 = statusCode + 63;
                AGResponse$Builder = i122 % 128;
                int i132 = i122 % 2;
            } else {
                int i14 = values + 43;
                AGState = i14 % 128;
                int i15 = i14 % 2;
            }
        } catch (IOException unused) {
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        if ((r1 % 2) != 0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0109, code lost:
        if ((r1 >>> 3) == 0) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getHeaders(int r9) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFocusableInTouchMode.getHeaders(int):int");
    }

    private static int getMethod(int i2) {
        char c2;
        MethodCollector.i(5693);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(getBody((char) (Process.myPid() >> 22), AndroidCharacter.getMirror('0') + 992, 22 - (KeyEvent.getMaxKeyCode() >> 16))));
            try {
                if (setWillNotCacheDrawing.getHeaders(bufferedInputStream, getMethod) != 0) {
                    int i3 = AGResponse$Builder;
                    int i4 = (i3 ^ 17) + ((i3 & 17) << 1);
                    statusCode = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = values + 69;
                        int i6 = i5 % 128;
                        AGState = i6;
                        if (i5 % 2 != 0) {
                            c2 = 'M';
                        } else {
                            c2 = 'D';
                        }
                        int i7 = i6 + 119;
                        values = i7 % 128;
                        int i8 = i7 % 2;
                    } else {
                        c2 = 0;
                    }
                    if (c2 != 0) {
                        getBody((char) (38791 >> View.getDefaultSize(1, 0)), 6998 % (ViewConfiguration.getDoubleTapTimeout() - 52), 77 >>> ImageFormat.getBitsPerPixel(1));
                        int i9 = (i2 ^ 10604) | (i2 & 10604);
                        bufferedInputStream.close();
                        MethodCollector.o(5693);
                        return i9;
                    }
                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 38791);
                    int i10 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i11 = ((i10 | 1062) << 1) - (i10 ^ 1062);
                    int i12 = -ImageFormat.getBitsPerPixel(0);
                    getBody(defaultSize, i11, (i12 & 30) + (i12 | 30));
                    return ((i2 & 242) ^ -1) & (i2 | 242);
                }
                bufferedInputStream.close();
                int i13 = values + 67;
                AGState = i13 % 128;
                int i14 = i13 % 2;
                int i15 = AGResponse$Builder;
                int i16 = (i15 ^ 85) + ((i15 & 85) << 1);
                statusCode = i16 % 128;
                int i17 = i16 % 2;
                int i18 = AGState + 97;
                values = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = AGResponse$Builder;
                    int i20 = (i19 ^ 125) + ((i19 & 125) << 1);
                    statusCode = i20 % 128;
                    if (i20 % 2 == 0) {
                        MethodCollector.o(5693);
                        return i2;
                    }
                } else {
                    int i21 = AGResponse$Builder;
                    int i22 = (i21 ^ 0) << ((i21 & 98) + 1);
                    statusCode = i22 / 22684;
                    if ((i22 >>> 4) == 0) {
                        MethodCollector.o(5693);
                        return i2;
                    }
                }
                MethodCollector.o(5693);
                return i2;
            } finally {
                bufferedInputStream.close();
                MethodCollector.o(5693);
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|23|24|25|26|(4:28|(1:30)(1:33)|31|(6:34|35|36|37|38|39)(2:40|41))(1:43)) */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01d2, code lost:
        if (r5 != 0) goto L_0x02ea;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0111 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int AGRequest(int r14) {
        /*
        // Method dump skipped, instructions count: 750
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFocusableInTouchMode.AGRequest(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x01ea, code lost:
        if ((r1 % 2) != 0) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x01f6, code lost:
        if ((r1 % 2) != 0) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0206, code lost:
        if (r4 != 1) goto L_0x0195;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getUrl(int r17) {
        /*
        // Method dump skipped, instructions count: 562
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFocusableInTouchMode.getUrl(int):int");
    }

    private static int getMethod(Context context, int i2) {
        int i3 = (values + 115) % 128;
        AGState = i3;
        int i4 = i3 + 113;
        int i5 = i4 % 128;
        values = i5;
        int i6 = i4 % 2;
        int i7 = statusCode;
        boolean z = true;
        int i8 = ((i7 | 45) << 1) - (i7 ^ 45);
        AGResponse$Builder = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = i5 + 103;
            AGState = i9 % 128;
            int i10 = i9 % 2;
        } else {
            int i11 = i5 + 7;
            AGState = i11 % 128;
            int i12 = i11 % 2;
            z = false;
        }
        if (z) {
            getMethod(context, 17, 0).getMethod();
            throw new NullPointerException("hashCode");
        }
        int method2 = getMethod(context, 17, 0).getMethod();
        int i13 = AGResponse$Builder;
        int i14 = (i13 & 99) + (i13 | 99);
        statusCode = i14 % 128;
        int i15 = i14 % 2;
        return method2;
    }

    private static int getHeaders(int i2, Context context) {
        Throwable cause;
        boolean z;
        int i3 = values + 79;
        AGState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AGResponse$Builder;
        int i6 = ((i5 | 89) << 1) - (i5 ^ 89);
        statusCode = i6 % 128;
        int i7 = i6 % 2;
        int indexOf = TextUtils.indexOf("", "", 0, 0);
        int i8 = -(-TextUtils.lastIndexOf("", '0'));
        getBody((char) ((indexOf ^ 58667) + ((58667 & indexOf) << 1)), (397 - ((-TextUtils.getTrimmedLength("")) ^ -1)) - 1, (i8 & 76) + (i8 | 76));
        int i9 = values + 27;
        AGState = i9 % 128;
        int i10 = i9 % 2;
        int i11 = statusCode;
        int i12 = (i11 ^ 21) + ((i11 & 21) << 1);
        AGResponse$Builder = i12 % 128;
        int i13 = i12 % 2;
        try {
            char indexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
            int size = View.MeasureSpec.getSize(0) + 201;
            int i14 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)));
            Class<?> cls = Class.forName(getBody(indexOf2, size, (i14 & 24) + (i14 | 24)));
            int i15 = -TextUtils.lastIndexOf("", '0', 0, 0);
            PackageManager packageManager = (PackageManager) com_apiguard3_internal_setFocusableInTouchMode_java_lang_reflect_Method_invoke(cls.getMethod(getBody((char) ((i15 ^ 41138) + ((41138 & i15) << 1)), 224 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.getDeadChar(0, 0) + 17), null), context, null);
            int i16 = values + 13;
            AGState = i16 % 128;
            int i17 = i16 % 2;
            try {
                int alpha = Color.alpha(0);
                Class<?> cls2 = Class.forName(getBody((char) View.resolveSize(0, 0), (242 - (TextUtils.lastIndexOf("", '0', 0, 0) ^ -1)) - 1, ((alpha | 33) << 1) - (alpha ^ 33)));
                char c2 = (char) ((-1 - ((-TextUtils.lastIndexOf("", '0', 0)) ^ -1)) - 1);
                float f2 = 0.0f;
                int i18 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                List list = (List) com_apiguard3_internal_setFocusableInTouchMode_java_lang_reflect_Method_invoke(cls2.getMethod(getBody(c2, (i18 ^ 274) + ((i18 & 274) << 1), (24 - (TextUtils.indexOf("", "") ^ -1)) - 1), Integer.TYPE), packageManager, new Object[]{0});
                try {
                    if (list.size() > 0) {
                        int i19 = values + 29;
                        AGState = i19 % 128;
                        int i20 = i19 % 2;
                        z = true;
                    } else {
                        int i21 = values + 5;
                        AGState = i21 % 128;
                        if (i21 % 2 != 0) {
                            z = false;
                        }
                        z = true;
                    }
                    if (!z) {
                        char myTid = (char) ((20631 - ((Process.myTid() >> 22) ^ -1)) - 1);
                        int i22 = -(ViewConfiguration.getTapTimeout() >> 16);
                        int i23 = statusCode;
                        int i24 = (i23 ^ 109) + ((i23 & 109) << 1);
                        AGResponse$Builder = i24 % 128;
                        int i25 = i24 % 2;
                        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent(getBody(myTid, (i22 & 371) + (i22 | 371), (26 - ((-View.MeasureSpec.makeMeasureSpec(0, 0)) ^ -1)) - 1)), 0)) {
                            ApplicationInfo applicationInfo = ((ComponentInfo) resolveInfo.activityInfo).applicationInfo;
                            int i26 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int edgeSlop = 298 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int indexOf3 = TextUtils.indexOf("", "", 0, 0);
                            Class<?> cls3 = Class.forName(getBody((char) (((i26 | 23638) << 1) - (i26 ^ 23638)), edgeSlop, (indexOf3 ^ 34) + ((indexOf3 & 34) << 1)));
                            int i27 = -TextUtils.lastIndexOf("", '0', 0);
                            int i28 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            String str = (String) cls3.getField(getBody((char) (((i27 | 5586) << 1) - (i27 ^ 5586)), (332 - ((-KeyEvent.getDeadChar(0, 0)) ^ -1)) - 1, ((i28 | 9) << 1) - (i28 ^ 9))).get(applicationInfo);
                            if (str == null) {
                                int i29 = AGState + 43;
                                values = i29 % 128;
                                int i30 = i29 % 2;
                            } else if (setWillNotCacheDrawing.getBody(str) == -7031551473171390769L) {
                                int i31 = AGResponse$Builder;
                                int i32 = ((i31 | 9) << 1) - (i31 ^ 9);
                                statusCode = i32 % 128;
                                int i33 = i32 % 2;
                                int i34 = -TextUtils.indexOf((CharSequence) "", '0');
                                int i35 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int i36 = (i35 & 342) + (i35 | 342);
                                int i37 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                getBody((char) (((i34 | 9257) << 1) - (i34 ^ 9257)), i36, (i37 ^ 29) + ((i37 & 29) << 1));
                                int i38 = ((i2 & 230) ^ -1) & (i2 | 230);
                                int i39 = (statusCode + 108) - 1;
                                AGResponse$Builder = i39 % 128;
                                int i40 = i39 % 2;
                                return i38;
                            }
                        }
                    } else {
                        int i41 = AGResponse$Builder;
                        int i42 = (i41 ^ 29) + ((i41 & 29) << 1);
                        statusCode = i42 % 128;
                        int i43 = i42 % 2;
                        int i44 = AGState + 107;
                        values = i44 % 128;
                        int i45 = i44 % 2;
                        int i46 = AGResponse$Builder;
                        int i47 = (i46 & 49) + (i46 | 49);
                        statusCode = i47 % 128;
                        int i48 = i47 % 2;
                        for (Object obj : list) {
                            int i49 = values + 5;
                            AGState = i49 % 128;
                            int i50 = i49 % 2;
                            int i51 = -Process.getGidForName("");
                            Class<?> cls4 = Class.forName(getBody((char) ((i51 & 23637) + (i51 | 23637)), (299 - ((ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) ^ -1)) - 1, View.getDefaultSize(0, 0) + 34));
                            int i52 = -(AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1));
                            int i53 = -(-(TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1)));
                            int i54 = (i53 ^ 332) + ((i53 & 332) << 1);
                            int i55 = -ExpandableListView.getPackedPositionType(0);
                            String str2 = (String) cls4.getField(getBody((char) ((i52 & 5588) + (i52 | 5588)), i54, (i55 ^ 9) + ((i55 & 9) << 1))).get(obj);
                            if (str2 != null) {
                                int i56 = AGState + 65;
                                values = i56 % 128;
                                int i57 = i56 % 2;
                                int i58 = AGResponse$Builder;
                                int i59 = (i58 ^ 15) + ((i58 & 15) << 1);
                                statusCode = i59 % 128;
                                if (i59 % 2 != 0) {
                                    int i60 = (setWillNotCacheDrawing.getBody(str2) > -7031551473171390769L ? 1 : (setWillNotCacheDrawing.getBody(str2) == -7031551473171390769L ? 0 : -1));
                                    throw new NullPointerException("hashCode");
                                }
                                int i61 = values + 53;
                                AGState = i61 % 128;
                                if (i61 % 2 != 0) {
                                    if (setWillNotCacheDrawing.getBody(str2) == -7031551473171390769L) {
                                    }
                                } else if (setWillNotCacheDrawing.getBody(str2) != -7031551473171390769L) {
                                }
                                int i62 = -(Process.myTid() >> 22);
                                int alpha2 = Color.alpha(0);
                                getBody((char) ((i62 ^ 9258) + ((i62 & 9258) << 1)), (342 - (TextUtils.indexOf((CharSequence) "", '0') ^ -1)) - 1, ((alpha2 | 30) << 1) - (alpha2 ^ 30));
                                return ((i2 & 230) ^ -1) & (i2 | 230);
                            }
                            f2 = 0.0f;
                        }
                    }
                } catch (RuntimeException unused) {
                }
                return i2;
            } catch (Throwable th) {
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } finally {
            cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01ca, code lost:
        r1 = -android.graphics.Color.blue(0);
        r0 = android.os.Process.myTid() >> 22;
        getBody((char) ((r1 ^ 36994) + ((36994 & r1) << 1)), (r0 ^ 632) + ((r0 & 632) << 1), (30 - (android.graphics.Color.argb(0, 0, 0, 0) ^ -1)) - 1);
        r2 = (r15 & -213) | ((r15 ^ -1) & 212);
        r4.close();
        r0 = com.apiguard3.internal.setFocusableInTouchMode.statusCode;
        r1 = (r0 ^ 117) + ((r0 & 117) << 1);
        com.apiguard3.internal.setFocusableInTouchMode.AGResponse$Builder = r1 % 128;
        r1 = r1 % 2;
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5560);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x020a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getMethod(int r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 548
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFocusableInTouchMode.getMethod(int, java.lang.String):int");
    }

    private static int getHeaders(int i2, String str) {
        boolean z;
        int i3 = (AGResponse$Builder + 52) - 1;
        statusCode = i3 % 128;
        if (i3 % 2 != 0) {
            z = true;
        } else {
            int i4 = values + 87;
            AGState = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (!z) {
            int i6 = -(-TextUtils.lastIndexOf("", '0'));
            int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1));
            getBody((char) (((i6 | 23483) << 1) - (i6 ^ 23483)), (i7 & 756) + (i7 | 756), 28 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)));
        } else {
            getBody((char) (15890 % TextUtils.lastIndexOf("", 'Q')), 6271 % (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), 11 << (ViewConfiguration.getZoomControlsTimeout() > 1 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1 ? 0 : -1)));
        }
        int i8 = AGResponse$Builder + 41;
        statusCode = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = AGState + 5;
            values = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = 0;
        while (true) {
            try {
                String[] strArr = addHeader;
                if (i11 >= strArr.length) {
                    break;
                } else if (setAutofillHints.AGRequest(new StringBuilder().append(strArr[i11]).append(str).toString(), headers)) {
                    char resolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                    int i12 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    getBody(resolveOpacity, ((fadingEdgeLength | 784) << 1) - (fadingEdgeLength ^ 784), (i12 ^ 1) + ((i12 & 1) << 1));
                    char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i13 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int i14 = (i13 ^ 785) + ((i13 & 785) << 1);
                    int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
                    getBody(fadingEdgeLength2, i14, (maximumFlingVelocity & 7) + (maximumFlingVelocity | 7));
                    int i15 = (i11 ^ 110) + ((i11 & 110) << 1);
                    int i16 = (i2 | i15) & ((i2 & i15) ^ -1);
                    int i17 = (statusCode + 66) - 1;
                    AGResponse$Builder = i17 % 128;
                    if (i17 % 2 != 0) {
                        int i18 = values + 65;
                        AGState = i18 % 128;
                        if (i18 % 2 != 0) {
                            return i16;
                        }
                    }
                    throw new NullPointerException("hashCode");
                } else {
                    i11 = ((i11 & 1) << 1) + (i11 ^ 1);
                    int i19 = values + 97;
                    AGState = i19 % 128;
                    int i20 = i19 % 2;
                    int i21 = statusCode;
                    int i22 = ((i21 | 25) << 1) - (i21 ^ 25);
                    AGResponse$Builder = i22 % 128;
                    int i23 = i22 % 2;
                }
            } catch (Exception unused) {
            }
        }
        return i2;
    }

    private static String getBody(char c2, int i2, int i3) {
        char[] cArr;
        int i4;
        int i5 = values;
        int i6 = i5 + 77;
        AGState = i6 % 128;
        int i7 = i6 % 2;
        int i8 = AGResponse$Builder + 67;
        statusCode = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = i5 + 107;
            AGState = i9 % 128;
            int i10 = i9 % 2;
            cArr = new char[i3];
            i4 = 1;
        } else {
            int i11 = i5 + 71;
            AGState = i11 % 128;
            int i12 = i11 % 2;
            cArr = new char[i3];
            i4 = 0;
        }
        while (true) {
            if (i4 >= i3) {
                int i13 = AGState + 119;
                values = i13 % 128;
                int i14 = i13 % 2;
                break;
            }
            int i15 = values + 53;
            AGState = i15 % 128;
            if (i15 % 2 == 0) {
                break;
            }
            int i16 = statusCode + 5;
            AGResponse$Builder = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = AGState + 71;
                values = i17 % 128;
                int i18 = i17 % 2;
            } else {
                int i19 = values + 89;
                AGState = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr[i4] = (char) ((int) ((((long) AGResponse[i2 + i4]) ^ (((long) i4) * build)) ^ ((long) c2)));
                    i4++;
                }
            }
            cArr[i4] = (char) ((int) ((((long) AGResponse[i2 % i4]) ^ (((long) i4) | build)) * ((long) c2)));
            i4 += 65;
        }
        return new String(cArr);
    }

    private static int getHeaders(int i2, getBody[] getbodyArr, String str) {
        int i3;
        int i4 = (statusCode + 92) - 1;
        AGResponse$Builder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = AGState + 123;
            values = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = AGState + 41;
            values = i7 % 128;
            if (i7 % 2 != 0) {
            }
        }
        int length = getbodyArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = AGResponse$Builder;
            int i10 = (i9 & 37) + (i9 | 37);
            statusCode = i10 % 128;
            if (i10 % 2 != 0) {
                getBody getbody = getbodyArr[i8];
                throw new NullPointerException("hashCode");
            }
            int i11 = values + 49;
            AGState = i11 % 128;
            int i12 = i11 % 2;
            getBody getbody2 = getbodyArr[i8];
            if (getbody2 != null) {
                int i13 = values + 73;
                AGState = i13 % 128;
                int i14 = i13 % 2;
                int url2 = getbody2.getUrl(str);
                if (url2 != 0) {
                    int i15 = AGState + 83;
                    values = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = statusCode;
                    int i18 = ((i17 | 105) << 1) - (i17 ^ 105);
                    AGResponse$Builder = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = values + 125;
                        AGState = i19 % 128;
                        int i20 = i19 % 2;
                    } else {
                        int i21 = AGState + 43;
                        values = i21 % 128;
                        if (i21 % 2 == 0) {
                            i3 = (i2 & (url2 ^ -1)) | ((i2 ^ -1) & url2);
                            int i22 = i17 + 13;
                            AGResponse$Builder = i22 % 128;
                            int i23 = i22 % 2;
                            return i3;
                        }
                    }
                    i3 = i2 | url2;
                    int i222 = i17 + 13;
                    AGResponse$Builder = i222 % 128;
                    int i232 = i222 % 2;
                    return i3;
                }
                int i24 = AGState + 59;
                values = i24 % 128;
                int i25 = i24 % 2;
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        r2 = getMethod(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03d5, code lost:
        if ((r1 % 2) == 0) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0060, code lost:
        if (r2 == r20) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0062, code lost:
        r1 = (com.apiguard3.internal.setFocusableInTouchMode.statusCode + 10) - 1;
        com.apiguard3.internal.setFocusableInTouchMode.AGResponse$Builder = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        if (r2 != r20) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (r2 != r20) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005a, code lost:
        if (r2 == r20) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.apiguard3.internal.setContextClickable getMethod(android.content.Context r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 1177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFocusableInTouchMode.getMethod(android.content.Context, int, int):com.apiguard3.internal.setContextClickable");
    }
}
