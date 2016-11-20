package ru.needforsite.gpushop.Model;

/**
 * Created by igorfrolov on 04.11.16.
 */

import javax.persistence.*;

@Entity
@Table(name = "gputable")
public class GPU {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "card_interface")
    private String cardInterface;

    @Column(name = "chipset")
    private String chipset;

    @Column(name = "gpu_frequency")
    private String gpuFrequency;

    @Column(name = "technical_process")
    private String technicalProcess;

    @Column(name = "memory_amount")
    private String memoryAmount;

    @Column(name = "memory_type")
    private String memoryType;

    @Column(name = "memory_frequency")
    private String memoryFrequency;

    @Column(name = "interface_width")
    private String interfaceWidth;

    @Column(name = "maximum_resolution")
    private String maximumResolution;

    @Column(name = "directx_version")
    private int directxVersion;

    @Column(name = "dvi_connectors")
    private int dviConnectors;

    @Column(name = "hdmi_connectors")
    private int hdmiConnectors;

    @Column(name = "hdmi_version")
    private float hdmiVersion;

    @Column(name = "display_port_connectors")
    private int dpConnectors;

    @Column(name = "display_port_version")
    private float dpVersion ;

    @Column(name = "power_supply")
    private String powerSupply;

    @Column(name = "recommended_power")
    private String recPower;

    @Column(name = "power_consumption")
    private String powerConsum;

    @Column(name = "card_length")
    private String cardLength;

    @Column(name = "cooling_system")
    private String coolSys;

    @Column(name = "card_width")
    private String cardWidth;

    @Column(name = "heat_pipes")
    private String heatPipes;

    @Column(name = "overclocked")
    private String overClocked;

    @Column(name = "delivery_type")
    private String deliveryType;

    @Column(name = "warranty")
    private String warranty;

    @Column(name = "website")
    private String webSite;

    @Column(name = "origin_country")
    private String originCountry;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardInterface() {
        return cardInterface;
    }

    public void setCardInterface(String cardInterface) {
        this.cardInterface = cardInterface;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getGpuFrequency() {
        return gpuFrequency;
    }

    public void setGpuFrequency(String gpuFrequency) {
        this.gpuFrequency = gpuFrequency;
    }

    public String getTechnicalProcess() {
        return technicalProcess;
    }

    public void setTechnicalProcess(String technicalProcess) {
        this.technicalProcess = technicalProcess;
    }

    public String getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(String memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public String getMemoryFrequency() {
        return memoryFrequency;
    }

    public void setMemoryFrequency(String memoryFrequency) {
        this.memoryFrequency = memoryFrequency;
    }

    public String getInterfaceWidth() {
        return interfaceWidth;
    }

    public void setInterfaceWidth(String interfaceWidth) {
        this.interfaceWidth = interfaceWidth;
    }

    public String getMaximumResolution() {
        return maximumResolution;
    }

    public void setMaximumResolution(String maximumResolution) {
        this.maximumResolution = maximumResolution;
    }

    public int getDirectxVersion() {
        return directxVersion;
    }

    public void setDirectxVersion(int directxVersion) {
        this.directxVersion = directxVersion;
    }

    public int getDviConnectors() {
        return dviConnectors;
    }

    public void setDviConnectors(int dviConnectors) {
        this.dviConnectors = dviConnectors;
    }

    public int getHdmiConnectors() {
        return hdmiConnectors;
    }

    public void setHdmiConnectors(int hdmiConnectors) {
        this.hdmiConnectors = hdmiConnectors;
    }

    public float getHdmiVersion() {
        return hdmiVersion;
    }

    public void setHdmiVersion(float hdmiVersion) {
        this.hdmiVersion = hdmiVersion;
    }

    public int getDpConnectors() {
        return dpConnectors;
    }

    public void setDpConnectors(int dpConnectors) {
        this.dpConnectors = dpConnectors;
    }

    public float getDpVersion() {
        return dpVersion;
    }

    public void setDpVersion(float dpVersion) {
        this.dpVersion = dpVersion;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getRecPower() {
        return recPower;
    }

    public void setRecPower(String recPower) {
        this.recPower = recPower;
    }

    public String getPowerConsum() {
        return powerConsum;
    }

    public void setPowerConsum(String powerConsum) {
        this.powerConsum = powerConsum;
    }

    public String getCardLength() {
        return cardLength;
    }

    public void setCardLength(String cardLength) {
        this.cardLength = cardLength;
    }

    public String getCoolSys() {
        return coolSys;
    }

    public void setCoolSys(String coolSys) {
        this.coolSys = coolSys;
    }

    public String getCardWidth() {
        return cardWidth;
    }

    public void setCardWidth(String cardWidth) {
        this.cardWidth = cardWidth;
    }

    public String getHeatPipes() {
        return heatPipes;
    }

    public void setHeatPipes(String heatPipes) {
        this.heatPipes = heatPipes;
    }

    public String getOverClocked() {
        return overClocked;
    }

    public void setOverClocked(String overClocked) {
        this.overClocked = overClocked;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    @Override
    public String toString() {
        return "GPU{" +
                "id=" + id +
                ", cardInterface='" + cardInterface + '\'' +
                ", chipset='" + chipset + '\'' +
                ", gpuFrequency='" + gpuFrequency + '\'' +
                ", technicalProcess='" + technicalProcess + '\'' +
                ", memoryAmount='" + memoryAmount + '\'' +
                ", memoryType='" + memoryType + '\'' +
                ", memoryFrequency='" + memoryFrequency + '\'' +
                ", interfaceWidth='" + interfaceWidth + '\'' +
                ", maximumResolution='" + maximumResolution + '\'' +
                ", directxVersion=" + directxVersion +
                ", dviConnectors=" + dviConnectors +
                ", hdmiConnectors=" + hdmiConnectors +
                ", hdmiVersion=" + hdmiVersion +
                ", dpConnectors=" + dpConnectors +
                ", dpVersion=" + dpVersion +
                ", powerSupply='" + powerSupply + '\'' +
                ", recPower='" + recPower + '\'' +
                ", powerConsum='" + powerConsum + '\'' +
                ", cardLength='" + cardLength + '\'' +
                ", coolSys='" + coolSys + '\'' +
                ", cardWidth='" + cardWidth + '\'' +
                ", heatPipes='" + heatPipes + '\'' +
                ", overClocked='" + overClocked + '\'' +
                ", deliveryType='" + deliveryType + '\'' +
                ", warranty='" + warranty + '\'' +
                ", webSite='" + webSite + '\'' +
                ", originCountry='" + originCountry + '\'' +
                '}';
    }
}
