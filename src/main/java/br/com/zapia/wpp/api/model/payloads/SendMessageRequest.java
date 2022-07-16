package br.com.zapia.wpp.api.model.payloads;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SendMessageRequest {

    private String chatId;
    private String webSite;
    private FileSend file;
    private String quotedMsg;
    private String text;
    private VCard vCard;
    private Location location;
    private String[] mentionedContacts;
    private Buttons buttons;
    private WhatsAppList whatsAppList;

    public SendMessageRequest() {
    }

    public SendMessageRequest(String chatId, FileSend file, String quotedMsg, String text, VCard vCard, Location location, String[] mentionedContacts, Buttons buttons, String webSite, WhatsAppList whatsAppList) {
        this.chatId = chatId;
        this.webSite = webSite;
        this.file = file;
        this.quotedMsg = quotedMsg;
        this.text = text;
        this.vCard = vCard;
        this.location = location;
        this.mentionedContacts = mentionedContacts;
        this.buttons = buttons;
        this.whatsAppList = whatsAppList;
    }

    public String getChatId() {
        return chatId;
    }

    public String getWebSite() {
        return webSite;
    }

    public FileSend getFile() {
        return file;
    }

    public String getQuotedMsg() {
        return quotedMsg;
    }

    public String getText() {
        return text;
    }

    public VCard getvCard() {
        return vCard;
    }

    public Location getLocation() {
        return location;
    }

    public String[] getMentionedContacts() {
        return mentionedContacts;
    }

    public Buttons getButtons() {
        return buttons;
    }

    public WhatsAppList getWhatsAppList() {
        return whatsAppList;
    }

    public static class Builder {

        private String chatId;
        private String webSite;
        private FileSend file;
        private String quotedMsg;
        private String text;
        private VCard vCard;
        private Location location;
        private List<String> mentionedContacts;
        private Buttons buttons;
        private WhatsAppList whatsAppList;

        public Builder() {
        }

        public Builder(String chatId) {
            this.chatId = chatId;
            this.mentionedContacts = new ArrayList<>();
        }

        public Builder withFile(String uuid) {
            return withFile(uuid, null);
        }

        public Builder withFile(String uuid, Consumer<FileBuilder> fileBuilderConsumer) {
            var builder = new FileBuilder(uuid);
            if (fileBuilderConsumer != null) {
                fileBuilderConsumer.accept(builder);
            }
            this.text = builder.getCaption();
            this.file = builder.build();
            return this;
        }

        public Builder withMentionToContact(String contactId) {
            this.mentionedContacts.add(contactId);
            return this;
        }

        public Builder withQuotedMsg(String messageId) {
            this.quotedMsg = messageId;
            return this;
        }

        public Builder withVCard(String name, String number) {
            this.vCard = new VCard(name, number);
            return this;
        }

        public Builder withText(String text) {
            this.text = text;
            return this;
        }

        public Builder withLocation(double lat, double lng) {
            return withLocation(lat, lng, null);
        }

        public Builder withLocation(double lat, double lng, Consumer<LocationBuilder> locationBuilderConsumer) {
            var builder = new LocationBuilder(lat, lng);
            if (locationBuilderConsumer != null) {
                locationBuilderConsumer.accept(builder);
            }
            this.location = builder.build();
            return this;
        }

        public Builder withButtons(String title, String footer, Consumer<ButtonsBuilder> buttonsBuilderConsumer) {
            var builder = new ButtonsBuilder(title, footer);
            buttonsBuilderConsumer.accept(builder);
            this.buttons = builder.build();
            return this;
        }

        public Builder withWebSite(String url) {
            this.webSite = url;
            return this;
        }

        public Builder withList(Consumer<ListBuilder> listBuilderConsumer) {
            var builder = new ListBuilder();
            listBuilderConsumer.accept(builder);
            this.whatsAppList = builder.build();
            return this;
        }

        public SendMessageRequest build() {
            return new SendMessageRequest(chatId, file, quotedMsg, text, vCard, location, mentionedContacts.isEmpty() ? null : mentionedContacts.toArray(String[]::new), buttons, webSite, whatsAppList);
        }
    }

    public static class FileSend {

        private String uuid;
        private boolean forceDocument;
        private StickerData stickerData;

        public FileSend() {
        }

        public FileSend(String uuid, boolean forceDocument, StickerData stickerData) {
            this.uuid = uuid;
            this.forceDocument = forceDocument;
            this.stickerData = stickerData;
        }

        public String getUuid() {
            return uuid;
        }

        public boolean isForceDocument() {
            return forceDocument;
        }

        public StickerData getStickerData() {
            return stickerData;
        }
    }

    public static class FileBuilder {

        private String caption;
        private String uuid;
        private boolean forceDocument;
        private StickerData stickerData;

        public FileBuilder() {
        }

        public FileBuilder(String uuid) {
            this.uuid = uuid;
        }

        public FileBuilder withForceDocument(boolean forceDocument) {
            this.forceDocument = forceDocument;
            return this;
        }

        public FileBuilder withCaption(String caption) {
            this.caption = caption;
            return this;
        }

        public FileBuilder withForceSticker(String stickerName) {
            return withForceSticker(stickerName, "");
        }

        public FileBuilder withForceSticker(String stickerName, String stickerCollectionName) {
            this.stickerData = new StickerData(stickerName, stickerCollectionName);
            return this;
        }

        public String getCaption() {
            return caption;
        }

        public FileSend build() {
            return new FileSend(uuid, forceDocument, stickerData);
        }
    }

    public static class StickerData {
        private final String stickerName;
        private final String stickerCollectionName;

        public StickerData(String stickerName, String stickerCollectionName) {
            this.stickerName = stickerName;
            this.stickerCollectionName = stickerCollectionName;
        }

        public String getStickerName() {
            return stickerName;
        }

        public String getStickerCollectionName() {
            return stickerCollectionName;
        }
    }

    public static class Location {

        private double lat;
        private double lng;
        private String name;
        private String description;

        public Location() {
        }

        public Location(double lat, double lng) {
            this.lat = lat;
            this.lng = lng;
        }

        public double getLat() {
            return lat;
        }

        public double getLng() {
            return lng;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            if (name != null && description != null) {
                return name + "\n" + description;
            }
            return name;
        }
    }

    public static class LocationBuilder {

        private double lat;
        private double lng;

        private String name;
        private String description;

        public LocationBuilder() {
        }

        public LocationBuilder(double lat, double lng) {
            this.lat = lat;
            this.lng = lng;
        }

        public LocationBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public LocationBuilder withDescription(String desc) {
            this.description = desc;
            return this;
        }

        public Location build() {
            var location = new Location(lat, lng);
            location.setName(name);
            location.setDescription(description);
            return location;
        }
    }

    public static class Buttons {

        private String title;
        private String footer;
        private String[] buttons;

        public Buttons() {
        }

        public Buttons(String title, String footer, String[] buttons) {
            this.title = title;
            this.footer = footer;
            this.buttons = buttons;
        }

        public String getTitle() {
            return title;
        }

        public String getFooter() {
            return footer;
        }

        public String[] getButtons() {
            return buttons;
        }
    }

    public static class ButtonsBuilder {

        private String title;
        private String footer;
        private List<String> buttons;

        public ButtonsBuilder() {
        }

        public ButtonsBuilder(String title, String footer) {
            this.title = title;
            this.footer = footer;
            this.buttons = new ArrayList<>();
        }

        public ButtonsBuilder withButton(String text) {
            this.buttons.add(text);
            return this;
        }

        public Buttons build() {
            return new Buttons(title, footer, buttons.toArray(String[]::new));
        }
    }

    public static class ListBuilder {

        private String title;
        private String description;
        private String footer;
        private String buttonText;
        private final List<Section> sections;

        public ListBuilder() {
            this.sections = new ArrayList<>();
        }

        public ListBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public ListBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ListBuilder withFooter(String footer) {
            this.footer = footer;
            return this;
        }

        public ListBuilder withButtonText(String buttonText) {
            this.buttonText = buttonText;
            return this;
        }

        public ListBuilder withSection(String sectionName, Consumer<SectionBuilder> sectionBuilderConsumer) {
            var builder = new SectionBuilder(sectionName);
            sectionBuilderConsumer.accept(builder);
            this.sections.add(builder.build());
            return this;
        }

        public ListBuilder withSection(Section section) {
            this.sections.add(section);
            return this;
        }

        public WhatsAppList build() {
            return new WhatsAppList(this.title, this.description, this.footer, this.buttonText, this.sections.toArray(Section[]::new));
        }
    }

    public static class SectionBuilder {

        private String name;
        private List<SectionItem> rows;

        public SectionBuilder() {
        }

        public SectionBuilder(String name) {
            this.name = name;
            this.rows = new ArrayList<>();
        }

        public SectionBuilder withRow(String title) {
            return withRow(title, null);
        }

        public SectionBuilder withRow(String title, String description) {
            this.rows.add(new SectionItem(title, description));
            return this;
        }

        public Section build() {
            return new Section(name, rows.toArray(SectionItem[]::new));
        }
    }

    public static class WhatsAppList {

        private String title;
        private String description;
        private String footer;
        private String buttonText;
        private Section[] sections;

        public WhatsAppList() {
        }

        public WhatsAppList(String title, String description, String footer, String buttonText, Section[] sections) {
            this.title = title;
            this.description = description;
            this.footer = footer;
            this.buttonText = buttonText;
            this.sections = sections;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getFooter() {
            return footer;
        }

        public String getButtonText() {
            return buttonText;
        }

        public Section[] getSections() {
            return sections;
        }
    }


    public static class Section {

        private String title;
        private SectionItem[] rows;

        public Section() {
        }

        public Section(String title, SectionItem[] rows) {
            this.title = title;
            this.rows = rows;
        }

        public String getTitle() {
            return title;
        }

        public SectionItem[] getRows() {
            return rows;
        }
    }

    public static class SectionItem {

        private String title;
        private String description;

        public SectionItem() {
        }

        public SectionItem(String title, String description) {
            this.title = title;
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }
    }

    public static class VCard {

        private String name;
        private String telephone;

        public VCard() {
        }

        public VCard(String name, String telephone) {
            this.name = name;
            this.telephone = telephone;
        }

        public String getName() {
            return name;
        }

        public String getTelephone() {
            return telephone;
        }
    }
}
