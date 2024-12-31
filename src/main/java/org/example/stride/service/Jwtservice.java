package org.example.stride.service;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class Jwtservice {
    public static final int INT = 60;
    public static final int INT1 = 24;

    private static final String SECRET_KEY ="27bc5821f84be3dca9696869c6248a4bbbf23e30906f1a6c7c2b79ce30e3c32a";
    public static String extractemail(String token) {
        return extractClaim(token,Claims::getSubject);
    }
     public static <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
    public String generateToken(UserDetails userDetails) {
        return generateToken(new HashMap<>(), userDetails);
    }
    public String generateToken(
            Map<String, Object> extraClaims,
            UserDetails userDetails
    ) {
    return Jwts
            .builder()
            .claims(extraClaims)
            .subject(userDetails.getUsername())
            .issuedAt(Date.from(Instant.now())) // Replaced with Instant.now()
            .expiration(Date.from(Instant.now().plusMillis(1000 * INT * INT * INT1))) // Replaced with Instant.now().plusMillis()
            .signWith(getSignInKey(), SignatureAlgorithm.HS256)
            .compact();
    }

    //method which can identify is token valid or not
    public boolean isTokenValid(String token , UserDetails userDetails) {
        final String username = extractemail(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

private boolean isTokenExpired(String token) {
    return extractExpiration(token).isBefore(Instant.now());
}


       private static Instant extractExpiration(String token) {
    Date expirationDate = extractClaim(token, Claims::getExpiration);
    return expirationDate.toInstant();
}

    private static Claims extractAllClaims(String token){
 return Jwts.parser()
.verifyWith(getSignInKey())
.build()
.parseSignedClaims(token)
.getPayload();
}
    private static SecretKey getSignInKey() {
 byte[] bytes = Base64.getDecoder()
                      .decode(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
         return new SecretKeySpec(bytes, "HmacSHA256"); }
}

