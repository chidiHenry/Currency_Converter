package com.chidi_pc.currencyconverter;

import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange {

    /**
     * success : true
     * timestamp : 1570013646
     * base : EUR
     * date : 2019-10-02
     * rates : {"AED":4.011015,"AFN":85.310022,"ALL":122.143947,"AMD":518.974173,"ANG":1.91314,"AOA":412.82219,"ARS":62.957567,"AUD":1.634179,"AWG":1.966759,"AZN":1.861948,"BAM":1.955784,"BBD":2.200891,"BDT":92.104034,"BGN":1.95622,"BHD":0.411709,"BIF":2014.425983,"BMD":1.092037,"BND":1.511054,"BOB":7.537731,"BRL":4.540468,"BSD":1.090082,"BTC":1.32E-4,"BTN":77.408493,"BWP":12.052261,"BYN":2.27122,"BYR":21403.924471,"BZD":2.1972,"CAD":1.446545,"CDF":1818.241782,"CHF":1.091152,"CLF":0.028891,"CLP":797.192445,"CNY":7.806315,"COP":3793.354196,"CRC":633.501103,"CUC":1.092037,"CUP":28.93898,"CVE":110.274191,"CZK":25.735598,"DJF":194.07632,"DKK":7.466145,"DOP":56.966652,"DZD":131.623493,"EGP":17.826433,"ERN":16.380835,"ETB":31.920521,"EUR":1,"FJD":2.400679,"FKP":0.887695,"GBP":0.890873,"GEL":3.259756,"GGP":0.89079,"GHS":5.875323,"GIP":0.887695,"GMD":55.147632,"GNF":10074.969448,"GTQ":8.426103,"GYD":228.055573,"HKD":8.563197,"HNL":26.830259,"HRK":7.415365,"HTG":104.811549,"HUF":334.228618,"IDR":15512.112048,"ILS":3.804864,"IMP":0.89079,"INR":77.837132,"IQD":1300.725226,"IRR":45980.2161,"ISK":135.488686,"JEP":0.89079,"JMD":146.207248,"JOD":0.774475,"JPY":117.507003,"KES":113.468699,"KGS":76.10384,"KHR":4478.558617,"KMF":491.741639,"KPW":982.918588,"KRW":1318.59109,"KWD":0.332531,"KYD":0.908405,"KZT":423.622835,"LAK":9616.532403,"LBP":1648.208433,"LKR":198.614212,"LRD":228.372201,"LSL":16.729624,"LTL":3.224501,"LVL":0.660562,"LYD":1.544085,"MAD":10.625028,"MDL":19.309946,"MGA":4065.871756,"MKD":61.503324,"MMK":1669.997455,"MNT":2912.986264,"MOP":8.803183,"MRO":389.857573,"MUR":39.838052,"MVR":16.817492,"MWK":799.005203,"MXN":21.67546,"MYR":4.580656,"MZN":67.662499,"NAD":16.741036,"NGN":395.317391,"NIO":36.642164,"NOK":9.990729,"NPR":123.853396,"NZD":1.75166,"OMR":0.420451,"PAB":1.090082,"PEN":3.673449,"PGK":3.710142,"PHP":56.802848,"PKR":170.952941,"PLN":4.367612,"PYG":6954.691564,"QAR":3.976134,"RON":4.74949,"RSD":117.437332,"RUB":71.377725,"RWF":1008.386931,"SAR":4.096336,"SBD":9.072535,"SCR":14.964231,"SDG":49.174968,"SEK":10.802135,"SGD":1.51317,"SHP":1.442473,"SLL":10428.9532,"SOS":633.380899,"SRD":8.144403,"STD":23545.179628,"SVC":9.537906,"SYP":562.398835,"SZL":16.696147,"THB":33.475312,"TJS":10.562891,"TMT":3.822129,"TND":3.130323,"TOP":2.547995,"TRY":6.262204,"TTD":7.38823,"TWD":33.937224,"TZS":2505.022345,"UAH":26.740742,"UGX":4014.637015,"USD":1.092037,"UYU":40.184236,"UZS":10297.307407,"VEF":10.906717,"VND":25291.576059,"VUV":129.081316,"WST":2.940054,"XAF":655.964838,"XAG":0.063288,"XAU":7.36E-4,"XCD":2.951284,"XDR":0.801391,"XOF":655.964753,"XPF":119.261523,"YER":273.336627,"ZAR":16.685561,"ZMK":9829.642545,"ZMW":14.209035,"ZWL":351.635903}
     */

    private boolean success;
    private int timestamp;
    private String base;
    private String date;
    private RatesBean rates;

    public List<Currency>getCurrency(){
           List<Currency>currencyList = new ArrayList<>();
           currencyList.add(new Currency("AED", rates.getAED()));
           currencyList.add(new Currency("ANG", rates.getANG()));
           currencyList.add(new Currency("AOA", rates.getAOA()));
           currencyList.add(new Currency("ARS", rates.getARS()));
           currencyList.add(new Currency("AUD", rates.getAUD()));
           currencyList.add(new Currency("AZN", rates.getAZN()));
           currencyList.add(new Currency("BAM", rates.getBAM()));
           currencyList.add(new Currency("BBD", rates.getBBD()));
           currencyList.add(new Currency("BDT", rates.getBDT()));
           currencyList.add(new Currency("BGN", rates.getBGN()));
           currencyList.add(new Currency("BHD", rates.getBHD()));
           currencyList.add(new Currency("BIF", rates.getBIF()));
           currencyList.add(new Currency("BMD", rates.getBMD()));
           currencyList.add(new Currency("BND", rates.getBND()));
           currencyList.add(new Currency("BOB", rates.getBOB()));
           currencyList.add(new Currency("EUR", rates.getEUR()));
           currencyList.add(new Currency("GHS", rates.getGHS()));
           currencyList.add(new Currency("GMD", rates.getGMD()));
           currencyList.add(new Currency("NGN", rates.getNGN()));
           currencyList.add(new Currency("PLN", rates.getPLN()));
           currencyList.add(new Currency("QAR", rates.getQAR()));
           currencyList.add(new Currency("TZS", rates.getTZS()));
           currencyList.add(new Currency("UGX", rates.getUGX()));
           currencyList.add(new Currency("USD", rates.getUSD()));
           currencyList.add(new Currency("XAG", rates.getXAG()));
           currencyList.add(new Currency("YER", rates.getYER()));
           currencyList.add(new Currency("ZAR", rates.getZAR()));
           currencyList.add(new Currency("ZWL", rates.getZWL()));
           return currencyList;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RatesBean getRates() {
        return rates;
    }

    public void setRates(RatesBean rates) {
        this.rates = rates;
    }

    public static class RatesBean {
        /**
         * AED : 4.011015
         * AFN : 85.310022
         * ALL : 122.143947
         * AMD : 518.974173
         * ANG : 1.91314
         * AOA : 412.82219
         * ARS : 62.957567
         * AUD : 1.634179
         * AWG : 1.966759
         * AZN : 1.861948
         * BAM : 1.955784
         * BBD : 2.200891
         * BDT : 92.104034
         * BGN : 1.95622
         * BHD : 0.411709
         * BIF : 2014.425983
         * BMD : 1.092037
         * BND : 1.511054
         * BOB : 7.537731
         * BRL : 4.540468
         * BSD : 1.090082
         * BTC : 1.32E-4
         * BTN : 77.408493
         * BWP : 12.052261
         * BYN : 2.27122
         * BYR : 21403.924471
         * BZD : 2.1972
         * CAD : 1.446545
         * CDF : 1818.241782
         * CHF : 1.091152
         * CLF : 0.028891
         * CLP : 797.192445
         * CNY : 7.806315
         * COP : 3793.354196
         * CRC : 633.501103
         * CUC : 1.092037
         * CUP : 28.93898
         * CVE : 110.274191
         * CZK : 25.735598
         * DJF : 194.07632
         * DKK : 7.466145
         * DOP : 56.966652
         * DZD : 131.623493
         * EGP : 17.826433
         * ERN : 16.380835
         * ETB : 31.920521
         * EUR : 1
         * FJD : 2.400679
         * FKP : 0.887695
         * GBP : 0.890873
         * GEL : 3.259756
         * GGP : 0.89079
         * GHS : 5.875323
         * GIP : 0.887695
         * GMD : 55.147632
         * GNF : 10074.969448
         * GTQ : 8.426103
         * GYD : 228.055573
         * HKD : 8.563197
         * HNL : 26.830259
         * HRK : 7.415365
         * HTG : 104.811549
         * HUF : 334.228618
         * IDR : 15512.112048
         * ILS : 3.804864
         * IMP : 0.89079
         * INR : 77.837132
         * IQD : 1300.725226
         * IRR : 45980.2161
         * ISK : 135.488686
         * JEP : 0.89079
         * JMD : 146.207248
         * JOD : 0.774475
         * JPY : 117.507003
         * KES : 113.468699
         * KGS : 76.10384
         * KHR : 4478.558617
         * KMF : 491.741639
         * KPW : 982.918588
         * KRW : 1318.59109
         * KWD : 0.332531
         * KYD : 0.908405
         * KZT : 423.622835
         * LAK : 9616.532403
         * LBP : 1648.208433
         * LKR : 198.614212
         * LRD : 228.372201
         * LSL : 16.729624
         * LTL : 3.224501
         * LVL : 0.660562
         * LYD : 1.544085
         * MAD : 10.625028
         * MDL : 19.309946
         * MGA : 4065.871756
         * MKD : 61.503324
         * MMK : 1669.997455
         * MNT : 2912.986264
         * MOP : 8.803183
         * MRO : 389.857573
         * MUR : 39.838052
         * MVR : 16.817492
         * MWK : 799.005203
         * MXN : 21.67546
         * MYR : 4.580656
         * MZN : 67.662499
         * NAD : 16.741036
         * NGN : 395.317391
         * NIO : 36.642164
         * NOK : 9.990729
         * NPR : 123.853396
         * NZD : 1.75166
         * OMR : 0.420451
         * PAB : 1.090082
         * PEN : 3.673449
         * PGK : 3.710142
         * PHP : 56.802848
         * PKR : 170.952941
         * PLN : 4.367612
         * PYG : 6954.691564
         * QAR : 3.976134
         * RON : 4.74949
         * RSD : 117.437332
         * RUB : 71.377725
         * RWF : 1008.386931
         * SAR : 4.096336
         * SBD : 9.072535
         * SCR : 14.964231
         * SDG : 49.174968
         * SEK : 10.802135
         * SGD : 1.51317
         * SHP : 1.442473
         * SLL : 10428.9532
         * SOS : 633.380899
         * SRD : 8.144403
         * STD : 23545.179628
         * SVC : 9.537906
         * SYP : 562.398835
         * SZL : 16.696147
         * THB : 33.475312
         * TJS : 10.562891
         * TMT : 3.822129
         * TND : 3.130323
         * TOP : 2.547995
         * TRY : 6.262204
         * TTD : 7.38823
         * TWD : 33.937224
         * TZS : 2505.022345
         * UAH : 26.740742
         * UGX : 4014.637015
         * USD : 1.092037
         * UYU : 40.184236
         * UZS : 10297.307407
         * VEF : 10.906717
         * VND : 25291.576059
         * VUV : 129.081316
         * WST : 2.940054
         * XAF : 655.964838
         * XAG : 0.063288
         * XAU : 7.36E-4
         * XCD : 2.951284
         * XDR : 0.801391
         * XOF : 655.964753
         * XPF : 119.261523
         * YER : 273.336627
         * ZAR : 16.685561
         * ZMK : 9829.642545
         * ZMW : 14.209035
         * ZWL : 351.635903
         */

        private double AED;
        private double AFN;
        private double ALL;
        private double AMD;
        private double ANG;
        private double AOA;
        private double ARS;
        private double AUD;
        private double AWG;
        private double AZN;
        private double BAM;
        private double BBD;
        private double BDT;
        private double BGN;
        private double BHD;
        private double BIF;
        private double BMD;
        private double BND;
        private double BOB;
        private double BRL;
        private double BSD;
        private double BTC;
        private double BTN;
        private double BWP;
        private double BYN;
        private double BYR;
        private double BZD;
        private double CAD;
        private double CDF;
        private double CHF;
        private double CLF;
        private double CLP;
        private double CNY;
        private double COP;
        private double CRC;
        private double CUC;
        private double CUP;
        private double CVE;
        private double CZK;
        private double DJF;
        private double DKK;
        private double DOP;
        private double DZD;
        private double EGP;
        private double ERN;
        private double ETB;
        private int EUR;
        private double FJD;
        private double FKP;
        private double GBP;
        private double GEL;
        private double GGP;
        private double GHS;
        private double GIP;
        private double GMD;
        private double GNF;
        private double GTQ;
        private double GYD;
        private double HKD;
        private double HNL;
        private double HRK;
        private double HTG;
        private double HUF;
        private double IDR;
        private double ILS;
        private double IMP;
        private double INR;
        private double IQD;
        private double IRR;
        private double ISK;
        private double JEP;
        private double JMD;
        private double JOD;
        private double JPY;
        private double KES;
        private double KGS;
        private double KHR;
        private double KMF;
        private double KPW;
        private double KRW;
        private double KWD;
        private double KYD;
        private double KZT;
        private double LAK;
        private double LBP;
        private double LKR;
        private double LRD;
        private double LSL;
        private double LTL;
        private double LVL;
        private double LYD;
        private double MAD;
        private double MDL;
        private double MGA;
        private double MKD;
        private double MMK;
        private double MNT;
        private double MOP;
        private double MRO;
        private double MUR;
        private double MVR;
        private double MWK;
        private double MXN;
        private double MYR;
        private double MZN;
        private double NAD;
        private double NGN;
        private double NIO;
        private double NOK;
        private double NPR;
        private double NZD;
        private double OMR;
        private double PAB;
        private double PEN;
        private double PGK;
        private double PHP;
        private double PKR;
        private double PLN;
        private double PYG;
        private double QAR;
        private double RON;
        private double RSD;
        private double RUB;
        private double RWF;
        private double SAR;
        private double SBD;
        private double SCR;
        private double SDG;
        private double SEK;
        private double SGD;
        private double SHP;
        private double SLL;
        private double SOS;
        private double SRD;
        private double STD;
        private double SVC;
        private double SYP;
        private double SZL;
        private double THB;
        private double TJS;
        private double TMT;
        private double TND;
        private double TOP;
        private double TRY;
        private double TTD;
        private double TWD;
        private double TZS;
        private double UAH;
        private double UGX;
        private double USD;
        private double UYU;
        private double UZS;
        private double VEF;
        private double VND;
        private double VUV;
        private double WST;
        private double XAF;
        private double XAG;
        private double XAU;
        private double XCD;
        private double XDR;
        private double XOF;
        private double XPF;
        private double YER;
        private double ZAR;
        private double ZMK;
        private double ZMW;
        private double ZWL;

        public double getAED() {
            return AED;
        }

        public void setAED(double AED) {
            this.AED = AED;
        }

        public double getAFN() {
            return AFN;
        }

        public void setAFN(double AFN) {
            this.AFN = AFN;
        }

        public double getALL() {
            return ALL;
        }

        public void setALL(double ALL) {
            this.ALL = ALL;
        }

        public double getAMD() {
            return AMD;
        }

        public void setAMD(double AMD) {
            this.AMD = AMD;
        }

        public double getANG() {
            return ANG;
        }

        public void setANG(double ANG) {
            this.ANG = ANG;
        }

        public double getAOA() {
            return AOA;
        }

        public void setAOA(double AOA) {
            this.AOA = AOA;
        }

        public double getARS() {
            return ARS;
        }

        public void setARS(double ARS) {
            this.ARS = ARS;
        }

        public double getAUD() {
            return AUD;
        }

        public void setAUD(double AUD) {
            this.AUD = AUD;
        }

        public double getAWG() {
            return AWG;
        }

        public void setAWG(double AWG) {
            this.AWG = AWG;
        }

        public double getAZN() {
            return AZN;
        }

        public void setAZN(double AZN) {
            this.AZN = AZN;
        }

        public double getBAM() {
            return BAM;
        }

        public void setBAM(double BAM) {
            this.BAM = BAM;
        }

        public double getBBD() {
            return BBD;
        }

        public void setBBD(double BBD) {
            this.BBD = BBD;
        }

        public double getBDT() {
            return BDT;
        }

        public void setBDT(double BDT) {
            this.BDT = BDT;
        }

        public double getBGN() {
            return BGN;
        }

        public void setBGN(double BGN) {
            this.BGN = BGN;
        }

        public double getBHD() {
            return BHD;
        }

        public void setBHD(double BHD) {
            this.BHD = BHD;
        }

        public double getBIF() {
            return BIF;
        }

        public void setBIF(double BIF) {
            this.BIF = BIF;
        }

        public double getBMD() {
            return BMD;
        }

        public void setBMD(double BMD) {
            this.BMD = BMD;
        }

        public double getBND() {
            return BND;
        }

        public void setBND(double BND) {
            this.BND = BND;
        }

        public double getBOB() {
            return BOB;
        }

        public void setBOB(double BOB) {
            this.BOB = BOB;
        }

        public double getBRL() {
            return BRL;
        }

        public void setBRL(double BRL) {
            this.BRL = BRL;
        }

        public double getBSD() {
            return BSD;
        }

        public void setBSD(double BSD) {
            this.BSD = BSD;
        }

        public double getBTC() {
            return BTC;
        }

        public void setBTC(double BTC) {
            this.BTC = BTC;
        }

        public double getBTN() {
            return BTN;
        }

        public void setBTN(double BTN) {
            this.BTN = BTN;
        }

        public double getBWP() {
            return BWP;
        }

        public void setBWP(double BWP) {
            this.BWP = BWP;
        }

        public double getBYN() {
            return BYN;
        }

        public void setBYN(double BYN) {
            this.BYN = BYN;
        }

        public double getBYR() {
            return BYR;
        }

        public void setBYR(double BYR) {
            this.BYR = BYR;
        }

        public double getBZD() {
            return BZD;
        }

        public void setBZD(double BZD) {
            this.BZD = BZD;
        }

        public double getCAD() {
            return CAD;
        }

        public void setCAD(double CAD) {
            this.CAD = CAD;
        }

        public double getCDF() {
            return CDF;
        }

        public void setCDF(double CDF) {
            this.CDF = CDF;
        }

        public double getCHF() {
            return CHF;
        }

        public void setCHF(double CHF) {
            this.CHF = CHF;
        }

        public double getCLF() {
            return CLF;
        }

        public void setCLF(double CLF) {
            this.CLF = CLF;
        }

        public double getCLP() {
            return CLP;
        }

        public void setCLP(double CLP) {
            this.CLP = CLP;
        }

        public double getCNY() {
            return CNY;
        }

        public void setCNY(double CNY) {
            this.CNY = CNY;
        }

        public double getCOP() {
            return COP;
        }

        public void setCOP(double COP) {
            this.COP = COP;
        }

        public double getCRC() {
            return CRC;
        }

        public void setCRC(double CRC) {
            this.CRC = CRC;
        }

        public double getCUC() {
            return CUC;
        }

        public void setCUC(double CUC) {
            this.CUC = CUC;
        }

        public double getCUP() {
            return CUP;
        }

        public void setCUP(double CUP) {
            this.CUP = CUP;
        }

        public double getCVE() {
            return CVE;
        }

        public void setCVE(double CVE) {
            this.CVE = CVE;
        }

        public double getCZK() {
            return CZK;
        }

        public void setCZK(double CZK) {
            this.CZK = CZK;
        }

        public double getDJF() {
            return DJF;
        }

        public void setDJF(double DJF) {
            this.DJF = DJF;
        }

        public double getDKK() {
            return DKK;
        }

        public void setDKK(double DKK) {
            this.DKK = DKK;
        }

        public double getDOP() {
            return DOP;
        }

        public void setDOP(double DOP) {
            this.DOP = DOP;
        }

        public double getDZD() {
            return DZD;
        }

        public void setDZD(double DZD) {
            this.DZD = DZD;
        }

        public double getEGP() {
            return EGP;
        }

        public void setEGP(double EGP) {
            this.EGP = EGP;
        }

        public double getERN() {
            return ERN;
        }

        public void setERN(double ERN) {
            this.ERN = ERN;
        }

        public double getETB() {
            return ETB;
        }

        public void setETB(double ETB) {
            this.ETB = ETB;
        }

        public int getEUR() {
            return EUR;
        }

        public void setEUR(int EUR) {
            this.EUR = EUR;
        }

        public double getFJD() {
            return FJD;
        }

        public void setFJD(double FJD) {
            this.FJD = FJD;
        }

        public double getFKP() {
            return FKP;
        }

        public void setFKP(double FKP) {
            this.FKP = FKP;
        }

        public double getGBP() {
            return GBP;
        }

        public void setGBP(double GBP) {
            this.GBP = GBP;
        }

        public double getGEL() {
            return GEL;
        }

        public void setGEL(double GEL) {
            this.GEL = GEL;
        }

        public double getGGP() {
            return GGP;
        }

        public void setGGP(double GGP) {
            this.GGP = GGP;
        }

        public double getGHS() {
            return GHS;
        }

        public void setGHS(double GHS) {
            this.GHS = GHS;
        }

        public double getGIP() {
            return GIP;
        }

        public void setGIP(double GIP) {
            this.GIP = GIP;
        }

        public double getGMD() {
            return GMD;
        }

        public void setGMD(double GMD) {
            this.GMD = GMD;
        }

        public double getGNF() {
            return GNF;
        }

        public void setGNF(double GNF) {
            this.GNF = GNF;
        }

        public double getGTQ() {
            return GTQ;
        }

        public void setGTQ(double GTQ) {
            this.GTQ = GTQ;
        }

        public double getGYD() {
            return GYD;
        }

        public void setGYD(double GYD) {
            this.GYD = GYD;
        }

        public double getHKD() {
            return HKD;
        }

        public void setHKD(double HKD) {
            this.HKD = HKD;
        }

        public double getHNL() {
            return HNL;
        }

        public void setHNL(double HNL) {
            this.HNL = HNL;
        }

        public double getHRK() {
            return HRK;
        }

        public void setHRK(double HRK) {
            this.HRK = HRK;
        }

        public double getHTG() {
            return HTG;
        }

        public void setHTG(double HTG) {
            this.HTG = HTG;
        }

        public double getHUF() {
            return HUF;
        }

        public void setHUF(double HUF) {
            this.HUF = HUF;
        }

        public double getIDR() {
            return IDR;
        }

        public void setIDR(double IDR) {
            this.IDR = IDR;
        }

        public double getILS() {
            return ILS;
        }

        public void setILS(double ILS) {
            this.ILS = ILS;
        }

        public double getIMP() {
            return IMP;
        }

        public void setIMP(double IMP) {
            this.IMP = IMP;
        }

        public double getINR() {
            return INR;
        }

        public void setINR(double INR) {
            this.INR = INR;
        }

        public double getIQD() {
            return IQD;
        }

        public void setIQD(double IQD) {
            this.IQD = IQD;
        }

        public double getIRR() {
            return IRR;
        }

        public void setIRR(double IRR) {
            this.IRR = IRR;
        }

        public double getISK() {
            return ISK;
        }

        public void setISK(double ISK) {
            this.ISK = ISK;
        }

        public double getJEP() {
            return JEP;
        }

        public void setJEP(double JEP) {
            this.JEP = JEP;
        }

        public double getJMD() {
            return JMD;
        }

        public void setJMD(double JMD) {
            this.JMD = JMD;
        }

        public double getJOD() {
            return JOD;
        }

        public void setJOD(double JOD) {
            this.JOD = JOD;
        }

        public double getJPY() {
            return JPY;
        }

        public void setJPY(double JPY) {
            this.JPY = JPY;
        }

        public double getKES() {
            return KES;
        }

        public void setKES(double KES) {
            this.KES = KES;
        }

        public double getKGS() {
            return KGS;
        }

        public void setKGS(double KGS) {
            this.KGS = KGS;
        }

        public double getKHR() {
            return KHR;
        }

        public void setKHR(double KHR) {
            this.KHR = KHR;
        }

        public double getKMF() {
            return KMF;
        }

        public void setKMF(double KMF) {
            this.KMF = KMF;
        }

        public double getKPW() {
            return KPW;
        }

        public void setKPW(double KPW) {
            this.KPW = KPW;
        }

        public double getKRW() {
            return KRW;
        }

        public void setKRW(double KRW) {
            this.KRW = KRW;
        }

        public double getKWD() {
            return KWD;
        }

        public void setKWD(double KWD) {
            this.KWD = KWD;
        }

        public double getKYD() {
            return KYD;
        }

        public void setKYD(double KYD) {
            this.KYD = KYD;
        }

        public double getKZT() {
            return KZT;
        }

        public void setKZT(double KZT) {
            this.KZT = KZT;
        }

        public double getLAK() {
            return LAK;
        }

        public void setLAK(double LAK) {
            this.LAK = LAK;
        }

        public double getLBP() {
            return LBP;
        }

        public void setLBP(double LBP) {
            this.LBP = LBP;
        }

        public double getLKR() {
            return LKR;
        }

        public void setLKR(double LKR) {
            this.LKR = LKR;
        }

        public double getLRD() {
            return LRD;
        }

        public void setLRD(double LRD) {
            this.LRD = LRD;
        }

        public double getLSL() {
            return LSL;
        }

        public void setLSL(double LSL) {
            this.LSL = LSL;
        }

        public double getLTL() {
            return LTL;
        }

        public void setLTL(double LTL) {
            this.LTL = LTL;
        }

        public double getLVL() {
            return LVL;
        }

        public void setLVL(double LVL) {
            this.LVL = LVL;
        }

        public double getLYD() {
            return LYD;
        }

        public void setLYD(double LYD) {
            this.LYD = LYD;
        }

        public double getMAD() {
            return MAD;
        }

        public void setMAD(double MAD) {
            this.MAD = MAD;
        }

        public double getMDL() {
            return MDL;
        }

        public void setMDL(double MDL) {
            this.MDL = MDL;
        }

        public double getMGA() {
            return MGA;
        }

        public void setMGA(double MGA) {
            this.MGA = MGA;
        }

        public double getMKD() {
            return MKD;
        }

        public void setMKD(double MKD) {
            this.MKD = MKD;
        }

        public double getMMK() {
            return MMK;
        }

        public void setMMK(double MMK) {
            this.MMK = MMK;
        }

        public double getMNT() {
            return MNT;
        }

        public void setMNT(double MNT) {
            this.MNT = MNT;
        }

        public double getMOP() {
            return MOP;
        }

        public void setMOP(double MOP) {
            this.MOP = MOP;
        }

        public double getMRO() {
            return MRO;
        }

        public void setMRO(double MRO) {
            this.MRO = MRO;
        }

        public double getMUR() {
            return MUR;
        }

        public void setMUR(double MUR) {
            this.MUR = MUR;
        }

        public double getMVR() {
            return MVR;
        }

        public void setMVR(double MVR) {
            this.MVR = MVR;
        }

        public double getMWK() {
            return MWK;
        }

        public void setMWK(double MWK) {
            this.MWK = MWK;
        }

        public double getMXN() {
            return MXN;
        }

        public void setMXN(double MXN) {
            this.MXN = MXN;
        }

        public double getMYR() {
            return MYR;
        }

        public void setMYR(double MYR) {
            this.MYR = MYR;
        }

        public double getMZN() {
            return MZN;
        }

        public void setMZN(double MZN) {
            this.MZN = MZN;
        }

        public double getNAD() {
            return NAD;
        }

        public void setNAD(double NAD) {
            this.NAD = NAD;
        }

        public double getNGN() {
            return NGN;
        }

        public void setNGN(double NGN) {
            this.NGN = NGN;
        }

        public double getNIO() {
            return NIO;
        }

        public void setNIO(double NIO) {
            this.NIO = NIO;
        }

        public double getNOK() {
            return NOK;
        }

        public void setNOK(double NOK) {
            this.NOK = NOK;
        }

        public double getNPR() {
            return NPR;
        }

        public void setNPR(double NPR) {
            this.NPR = NPR;
        }

        public double getNZD() {
            return NZD;
        }

        public void setNZD(double NZD) {
            this.NZD = NZD;
        }

        public double getOMR() {
            return OMR;
        }

        public void setOMR(double OMR) {
            this.OMR = OMR;
        }

        public double getPAB() {
            return PAB;
        }

        public void setPAB(double PAB) {
            this.PAB = PAB;
        }

        public double getPEN() {
            return PEN;
        }

        public void setPEN(double PEN) {
            this.PEN = PEN;
        }

        public double getPGK() {
            return PGK;
        }

        public void setPGK(double PGK) {
            this.PGK = PGK;
        }

        public double getPHP() {
            return PHP;
        }

        public void setPHP(double PHP) {
            this.PHP = PHP;
        }

        public double getPKR() {
            return PKR;
        }

        public void setPKR(double PKR) {
            this.PKR = PKR;
        }

        public double getPLN() {
            return PLN;
        }

        public void setPLN(double PLN) {
            this.PLN = PLN;
        }

        public double getPYG() {
            return PYG;
        }

        public void setPYG(double PYG) {
            this.PYG = PYG;
        }

        public double getQAR() {
            return QAR;
        }

        public void setQAR(double QAR) {
            this.QAR = QAR;
        }

        public double getRON() {
            return RON;
        }

        public void setRON(double RON) {
            this.RON = RON;
        }

        public double getRSD() {
            return RSD;
        }

        public void setRSD(double RSD) {
            this.RSD = RSD;
        }

        public double getRUB() {
            return RUB;
        }

        public void setRUB(double RUB) {
            this.RUB = RUB;
        }

        public double getRWF() {
            return RWF;
        }

        public void setRWF(double RWF) {
            this.RWF = RWF;
        }

        public double getSAR() {
            return SAR;
        }

        public void setSAR(double SAR) {
            this.SAR = SAR;
        }

        public double getSBD() {
            return SBD;
        }

        public void setSBD(double SBD) {
            this.SBD = SBD;
        }

        public double getSCR() {
            return SCR;
        }

        public void setSCR(double SCR) {
            this.SCR = SCR;
        }

        public double getSDG() {
            return SDG;
        }

        public void setSDG(double SDG) {
            this.SDG = SDG;
        }

        public double getSEK() {
            return SEK;
        }

        public void setSEK(double SEK) {
            this.SEK = SEK;
        }

        public double getSGD() {
            return SGD;
        }

        public void setSGD(double SGD) {
            this.SGD = SGD;
        }

        public double getSHP() {
            return SHP;
        }

        public void setSHP(double SHP) {
            this.SHP = SHP;
        }

        public double getSLL() {
            return SLL;
        }

        public void setSLL(double SLL) {
            this.SLL = SLL;
        }

        public double getSOS() {
            return SOS;
        }

        public void setSOS(double SOS) {
            this.SOS = SOS;
        }

        public double getSRD() {
            return SRD;
        }

        public void setSRD(double SRD) {
            this.SRD = SRD;
        }

        public double getSTD() {
            return STD;
        }

        public void setSTD(double STD) {
            this.STD = STD;
        }

        public double getSVC() {
            return SVC;
        }

        public void setSVC(double SVC) {
            this.SVC = SVC;
        }

        public double getSYP() {
            return SYP;
        }

        public void setSYP(double SYP) {
            this.SYP = SYP;
        }

        public double getSZL() {
            return SZL;
        }

        public void setSZL(double SZL) {
            this.SZL = SZL;
        }

        public double getTHB() {
            return THB;
        }

        public void setTHB(double THB) {
            this.THB = THB;
        }

        public double getTJS() {
            return TJS;
        }

        public void setTJS(double TJS) {
            this.TJS = TJS;
        }

        public double getTMT() {
            return TMT;
        }

        public void setTMT(double TMT) {
            this.TMT = TMT;
        }

        public double getTND() {
            return TND;
        }

        public void setTND(double TND) {
            this.TND = TND;
        }

        public double getTOP() {
            return TOP;
        }

        public void setTOP(double TOP) {
            this.TOP = TOP;
        }

        public double getTRY() {
            return TRY;
        }

        public void setTRY(double TRY) {
            this.TRY = TRY;
        }

        public double getTTD() {
            return TTD;
        }

        public void setTTD(double TTD) {
            this.TTD = TTD;
        }

        public double getTWD() {
            return TWD;
        }

        public void setTWD(double TWD) {
            this.TWD = TWD;
        }

        public double getTZS() {
            return TZS;
        }

        public void setTZS(double TZS) {
            this.TZS = TZS;
        }

        public double getUAH() {
            return UAH;
        }

        public void setUAH(double UAH) {
            this.UAH = UAH;
        }

        public double getUGX() {
            return UGX;
        }

        public void setUGX(double UGX) {
            this.UGX = UGX;
        }

        public double getUSD() {
            return USD;
        }

        public void setUSD(double USD) {
            this.USD = USD;
        }

        public double getUYU() {
            return UYU;
        }

        public void setUYU(double UYU) {
            this.UYU = UYU;
        }

        public double getUZS() {
            return UZS;
        }

        public void setUZS(double UZS) {
            this.UZS = UZS;
        }

        public double getVEF() {
            return VEF;
        }

        public void setVEF(double VEF) {
            this.VEF = VEF;
        }

        public double getVND() {
            return VND;
        }

        public void setVND(double VND) {
            this.VND = VND;
        }

        public double getVUV() {
            return VUV;
        }

        public void setVUV(double VUV) {
            this.VUV = VUV;
        }

        public double getWST() {
            return WST;
        }

        public void setWST(double WST) {
            this.WST = WST;
        }

        public double getXAF() {
            return XAF;
        }

        public void setXAF(double XAF) {
            this.XAF = XAF;
        }

        public double getXAG() {
            return XAG;
        }

        public void setXAG(double XAG) {
            this.XAG = XAG;
        }

        public double getXAU() {
            return XAU;
        }

        public void setXAU(double XAU) {
            this.XAU = XAU;
        }

        public double getXCD() {
            return XCD;
        }

        public void setXCD(double XCD) {
            this.XCD = XCD;
        }

        public double getXDR() {
            return XDR;
        }

        public void setXDR(double XDR) {
            this.XDR = XDR;
        }

        public double getXOF() {
            return XOF;
        }

        public void setXOF(double XOF) {
            this.XOF = XOF;
        }

        public double getXPF() {
            return XPF;
        }

        public void setXPF(double XPF) {
            this.XPF = XPF;
        }

        public double getYER() {
            return YER;
        }

        public void setYER(double YER) {
            this.YER = YER;
        }

        public double getZAR() {
            return ZAR;
        }

        public void setZAR(double ZAR) {
            this.ZAR = ZAR;
        }

        public double getZMK() {
            return ZMK;
        }

        public void setZMK(double ZMK) {
            this.ZMK = ZMK;
        }

        public double getZMW() {
            return ZMW;
        }

        public void setZMW(double ZMW) {
            this.ZMW = ZMW;
        }

        public double getZWL() {
            return ZWL;
        }

        public void setZWL(double ZWL) {
            this.ZWL = ZWL;
        }
    }
}
