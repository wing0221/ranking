
-- -- INSERT into users (username,password) VALUES ("TAROU","PASSWORD" );
INSERT IGNORE INTO
    user (
        user_id, -- ユーザID
        login_id, -- ログインID
        user_name, --　ユーザー名
        password, --　パスワード
        email, -- Eメール
        profile, -- プロフィール
        profile_img --　プロフィール画像
    ) 
    VALUES (
        1,
        "tsubasa0001",
        "つばさ",
        "123456",
        "tsubasa0221@example.com",
        "なし",
        "なし"
    );