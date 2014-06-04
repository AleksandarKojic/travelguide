package com.guidewithme.expansion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KeyMap
{
  final static Map<String, String> COUTRY_2_KEY = new HashMap<String, String>();

  private final static int KEY_LENGHT = 392;
  private final static int KEY_COUNT = 25;

  static
  {
    COUTRY_2_KEY.put("hawaii", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA14T4ru6Wj03NA8e/Gf4/MacpWjk+/j52lAe8Q5TWWlEeiRkvWYAWgT20O2rryGRTCNmgb69rDMch0QrXndenKucRHtG4q9xhF0KCeTFOpU3gHkP/oPmGTvhghDjCYRiQRNgcGDTfsrTDmyDwIaYJzNV9PbDht6e3UbhM+cN06QDTUreU9KSzXtNInXH9tZ4d4S3piO/f1tQRWTqUdNGav2xNaRsNrb61ZUyMdd4X+ap3c25xmsB4/snV61i/P5vEEeknzLaqI0KpCbxvGqSADTYfEycDue/+BXmVpcR7tsn3a/ebIBjUKzU09MwSrHDA01+BB03FF9w2PRUDLAFUdQIDAQAB");
    COUTRY_2_KEY.put("california", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApcL+Gljmb5RtgCNrzzVJX6NehpniQhHL5YpbNGkY9ydPky/hTa3ThE6Y7fQiNnb1Bai695GPRAIYvHogbLV9YIJOYu1k3DpbrcwTJtSlhi827FS69pSUaGsDEVUxlxerjgCcRcqlYhZUbPi+5ACsQWVMqnHa+WTj3CfGAOuEH0CGhJk03QmMikC5jcWP9v4/ZthsSzeEwc9zX0DwxXzJ/tB0Tn7ot5EYzWGD49Lt0qMzDapmrQzLD2Avib8xtBTq76vXKB+GXKhnrDRQKsXThk00VHLwsj+j9CYgPbx3ExJKJjPSXslkbgCQxkxgFRe2CQG1qmOC0eWUZWugEIulFwIDAQAB");
    COUTRY_2_KEY.put("france", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtgHuz8EnzqJWMl3YE65hAC71FYOF3vM9cS5JieU42c3Yw5S3owvNgKda+fYo6h65tH+nM5yeHVkgYiRqdV6h0zAGWLH5NcFnIKlQZbp2gUWz4QIrmJPUnevGObVV84q3G0EmMXz1Fyn4KdydMaiE+9RzLn6BAKXPeXtu0XGiyqAGfc5vEVFJ2oDR0+2FFrchFF22tKAa2xe7m6sfUwSDopY8XwYtjUZttgGexTsHlETWelwWJRJs+9kmJCi5YDcUIhtq4UX1KJQTsq9ZToH8RmLLbFIaphqPazz0uNNrvCuVBp2OGzQqIAHVb3oCXCs+ESGROhcPnpZ5/4WMPf6jVwIDAQAB");
    COUTRY_2_KEY.put("germany", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhUM4Tl0QRKgbsiJVbnK1xPVoxZYl4s9LdfulKdhdkf1iI0iyW8e4cR9V6EzTrfpVIISckFu7acR6ObCPWxxLPZmBBE8CslyZtCx4+kI6lS3+hqEFbN+w4vYkGQtZl8Ie/oQmsSmYhmRdMtp1u7EEVLuMjHu0/bC8Rt8UIJV7NmzdipPpfM3ss+cKg2E1tU7w+W85zEUZy9UsgBNVx+KcGRMI5YPssdQ8AykCam4HT0EJ4w/eoR4D7qFLGE1HhX73cIPPzV6OFXRhxtnsxeokf1po0SMCkaJXOPVEolBZ3PMMYfWi/oSRDSthB02ndChIKzRuja+vZd6ip357ns3UkwIDAQAB");
    COUTRY_2_KEY.put("greece", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhppmFgHHGTa90mJ2eCT3iTCJj7pj7UbpN7Nt05xXykDj62HCqt4M2u4IC9e4HFr5R+qc/jF6I0sAb+/yV3nXY83MmzsSJGGKMkCItzAfv05bRCqNSUwk8eBZXMvHIXQXgA7mfK/effHYSbZSaaHajkkrbWZg87/oembsjkILgJfGLHc/vvHOFui903r3qqp40YCPXMXKjNAqZeDm4zewY8o3BWubhc6WvAau7TyXMTB0teq8DEvp16cdGYUhWjFiQMVp8X1UunRTZNz3bxwEQzOCtEph/m6VdQLE6fKDFETUIXpob23cy5f0W5iCEOu3Z+H5+JlBy51/6fC6ZUTK3wIDAQAB");
    COUTRY_2_KEY.put("italy", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmwCretR+l2z+nlah+St0EWtEyIbTzbxW2EUYspHtSMN7YtPLM48pW5jSyQ3WWWOx3N9Yr+woxxuHJ8OZxeJ05600JGiX9aLzsr3Tqh4o0KeisTFzbbLylLCkcBXfetaY0788yrkXb3KNdhH3drlqtzNXTJSf6VUBZlof8ml+3dixjyQwMNq8cQG7FpKFqDvvVJE+kHfU4itZe+GzXPp+3JSLgDpMo5X0+qPJ6hBTeA6EeNkuDUgIOkXoxlxooslEr2EaYsrSXP3tqMJ0lEFLqf/tMQDMWU2Ygw1BGPbD4pYZBVOmIGAzjxtuuSlVUggM/ekkcrTemKK8IzYQd4+KlwIDAQAB");
    COUTRY_2_KEY.put("japan", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn1d9SrCfDmv4s4twnr5Y7m41bWEyClQhTJeIRF5DLo/WUPiZGbwAUCcFIKeScNeeFt4sAjoK5u3ORAymDRb3Y3JL6cm+wyc+sGrHJxfnNEFwNz9wMGWpgnnfliBdODLauFLXjJTBuXIXPqJqC3IO9ZdOzdCePQliOgDXMubi/1V5hY1x0KFdxfuGtY4JWLIBG5sPyDP0ODj2XOwhNyIaFbqfcoV8WwckGdDGvsx4qavLZ3fKLEF+txVKIkdgZn1Gy2hKS3yKp+DmEY1dXMTXi4iIiR/osEVElD4H9cyWc+ZN7bUNL8eBD85GQv8GyH9OLRS5LRG2vzBwUQ87kj7t8wIDAQAB");
    COUTRY_2_KEY.put("russia", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAknN1T57PpDn9ToHY+m3Y8m/r9WsVugl67Gyl0U7Fta7fT+j4s+GqfpTe7sHAi/zfTN+9LjkttqI8b53pj9g+DBx3TNyNHoSYaokiwLomEA8p7LJAS5vSHDzL0kMs2wOa8MHViwWacKISrekj9RD/8HSk9MuCp9f7BlOAS36j/MW5YV1qMbNSB1gejGQb9zVsc0PphN1wdeounO8vvGmfLhKGEZL5rSqnahgQJFjaXlWGv79xFkRWixyiQyD+eJUKMMpgg5TttypaHosIQGrVbspe+oWTfJiTakwlglAEZle4VbltzJnhF/ywRYq7IchW7BrjsrCwa23Z+p6hGOd32QIDAQAB");
    COUTRY_2_KEY.put("spain", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnwbrpx9R+ZjdcVqiA7wBgfU9LOCGncV2H2baapdew4euKMCoK0+bMIDHZceIyc7aQJF7KGjPprbw6pUUziwzLHYH5yp8oP4d5bXbL1nZaUMCf2YYeEUpdW7iNjqtfMlv6AqvpC1TjNg/jrkoWgPK9ojWQBLlH+IYVBhGhmwT1UfW031YByp+UVhSHoyC3vUPCEXo2S/KIzd9r+h7JyGImTdmbfRkf2eJDcrwvs5OtCjJ+4ch8Xbrmy5Sr3nZg6ZziAvBDFRIeHbybboqesdhknvEgHVo9iUSD8ltBD9X2RkQpBXvoIS+Uq4tAcR/3i3fSQ7WUF0tbe508S6np5QvHQIDAQAB");
    COUTRY_2_KEY.put("switzerland", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn5s5bicbujNjm8IdqTT87TISYgIHEilt9cjl/pcfpKiIXA+e6VBl1ePdaZoQiS1g2nN4a1tLTtfe6QVwsZpwxt4NogpOsBTd1LNsUjRPdqI3Co2Yb9KhaHeLVrw6wuXJvDrmdvHo4lq3B791PVzL7kmAJflGL/MDbiJrKDI7Kea2Ah00igZw/xy01wLklYx++oXYRgXTZYtLjLWJu0cxIYIZ+FstXR91Sgk/zsudycEZdFCsHAbggJF8nBvzCfOfaTGnUem7Jc0zYLvUf//ZUwpJtkwrtAb+THv2Isnc2ZkE9Lv+HnJXmvx0k9ZI0P5fccmjscFOpzWIgqt56f7nbwIDAQAB");
    COUTRY_2_KEY.put("turkey", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0wOCJ6FwP+6EclHeZOLvYqDq3gml/16SxdtobkNP7qxYjGJfmjoxYWIa2XxgmgHmJEanKCtNbzpW++seP4f/9FJzepy4UMNrzubpK24yvOpHssMNjEiKcrT/rfMznbiPAMcLw7AMU2iulk+TWbmQD9Roj/sx0nANkO9FZ6kHkzBy4Z5qjGOqDFzhKdVWHQrjKIUWCEs1kRsT6EEkdDV+MKRl18s/tgA3FqSil7GCGko5aArF0EJWkbNryiwpfUMIQ3x2k66YRXzEFHwGm+26V+fMV3Bm3yBfkE7yC81KeiVrIXvSduOBn8j0bQd2qhtKc7JR8KZ/s6JmNASicWEs6QIDAQAB");
    COUTRY_2_KEY.put("uk", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAu1XiE4QTmYZvKH5VPu5RwSeW0B5SzGyVGFc9fBona0J7gNHGBb7zW6MJzxrnen725/JvWCsQQPjEbfGQGn8SZcxCrKMcN4rBQLtw66fmllEJgtFORZMep0WlH+8Wk9Ss4CvYwnvwUsHtTRAQbFKYBbaGVHZwZBKDyVNzTAuM+jQo8RPocbkbhv8bcBy3z4oolAMhBZghAIOBafi608zv+AVW3L1SJZ9gWrVC/+F5YlxXV4+7npImHjThwB9ZDjWkSJZjlQSiDkNf6H0PnyMv+yymyOumXMoiXW4uLTGAWXhpUxrLuIpAd8M2lDU3Ofwxz2tMkd7QuB/ZSgEmlyCs0QIDAQAB");
    COUTRY_2_KEY.put("new.zealand", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvQ25Eib6bGvKr0EcRJjdB48xPs38kcsVzw4+AIsqj6xuGR+xvz2PdaQb+iC18P5ztlYPHQofvEUhFAsN35loESKjjqXHelLY1FrtNCnx/hHtUtTFQn4+dwPi9giDd+vg7vI8jR/YJkQwHtCnMskgu1sPNbrf4EFms6YiyTMvHrq0K6/phxFZ4R1lVsVB4uTaUDhzLfRCXJj0s+hN9kh+VH0rsEKCiBv2rCw/ttoJe0YOkWPQVEdSocA13FCMvvwjF0iFveWLeOqXJ2jX+aSy2w25r+K7G9rapXNtrc/NFkdYBlNFRgOqGw0hWrkzLumfdrZvHsSMQmC4eLzOp2n4PQIDAQAB");
    COUTRY_2_KEY.put("thailand", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkOqgy1woDEfvsSHHuL02MqR0bG5WP4sQn0VvWlPEj/nlD0SMRGvvaAfPEJsyIGLMx/ucXT6oURJlN7FZUMLFvrB4b1eKz6+faQ9FgO0dWkhnsCWzP3oI4L1kV+AOfCbvI3TtxS3AWJfNzVModA4xvqBJAtqveVe+bmt4qNA/uZBc/yArJ5oEwBNz62y6At4FZ8XUR+zuHcIF2t74lIFnP9E8pbGQLSW76n1A5oSgu/dCiJyRr3RGvsmVrySyaZ/pWdri8yyGLxVZwJ1SvOSedHd0tqmu4MdscZjn2+9zJk0C3K6Z92CIqYW30clvfwrOBEAF4i9NusxdnHx0WGDiYwIDAQAB");
    COUTRY_2_KEY.put("nepal", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnFoTEKP+ERs59UoyPTSwDck0EeXWjKOfgwdKpmYn4vUjx21sBt31lPOUWK3jtaz3XPgCETPKEAwxdW5FNJooeVoMSbMz4oVU9+kd7XuF1mmq77Mb2KbybRzVQaEJhfG+ufvqTucGWRLYdkkLUrZp2FM+iEiRfGWkKovYPmOms0vo3oLeXZUzISAFII8OmJTep+nQq/yH9/OytTmhNMZMKUl9TQdNSuhD97NS2HDy9NVtOj0xkk+FfVrrUmim2QxnadV5kPBrI+8n8+AqvKBrdN0kticqugrukYL+hVW79yuD3bQaiSD07dmrQK+SfrHi8sQN+3g6Ik0Fbe2UKmuvyQIDAQAB");
    COUTRY_2_KEY.put("malaysia", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnY2STXugrPqKI7qQEbRCq7OuRSPf7qTs10QRgxNYoCB3iaxhPjzHcpf6z6pklQPZazDNedi2l/Xq5WDR6ZFmv2D9dzzMdN0KsybjtklX34LIbJ5VNq94P1ti5J0bNdjhpC3dajNztM7Qshtabqm771GIr4yTPrjF3pxrzNbBuFI6Yo4mHbYlMFSJQ0JfuguzG92VMOJ5R+jnKgD8tbD5dqLKWTxS3fKhe6tksjS3/gKwRCq31fWlDqhYW2qZBBq9aH3i6QMbwTNE7ZL4YG4amYxPn8+y9S+U+QS8GWgBvblrQQma4d+4WGwoEH4aIu8DqG6K5/gDILom38AAu6Yx0QIDAQAB");
    COUTRY_2_KEY.put("singapore", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxvz+WoIRoIzoZO/V4xPeTGRJxx5c42BadwChlRAJlDEoQxZGBNPWffNeTZXKpvGJ4l5ByQMNzuGyna1yJoc63dQIgpUjD0PULxBKTG3GopRJKG7AEsBuHEFdAEeOtp0BuJ0BFgWf0ozJCMuI3QUOTTGPo9eVVUnSW7oXTsM4QcJhAMpir6EUWW1EsGj3uw8o2gMpJLZeaTqBKZe8yEk6uXJxYPpiDr28862Lf9QS84eAHfv1zCw6j+cgczVFH26i3+ybW3wT01qgtFnYfHNzJM13iEhGlYo+6WeSyLh7KyTSDUuk93/GBzfRVADIUguPkoJCYukUFQXWHbByD9r2AQIDAQAB");
    COUTRY_2_KEY.put("poland", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAl9ErKCWLEsLU08CNj0dcE/rhIJYScNzermFzxy5AOMfXKCvnC5/oVWylD7wdeH7igdAX5/l+TEcXlFAhLY0gtWqDP4h9HFBPAbVDEi4HDi1RhPro8rbljMwNmF3mvU2IjOVsnyEtxdL0hVpW0OVvvrUnTnh7lJSQZ2W4kAJ8RxUqAOISqDVkD8dOyajYRcwdmnhUccpfC5WSkCatgO0qWK0B+yw2/6Wn6PXd44FPoprmqmgq4lc+7r1Yg/qpvx4UNoVguZHm/LvMRgB2OWwfW4m1qeJZtPCwggZyNjzgAyWgcEydJwi8OAE3vsFMb7B89SNqc2eWhOxQYDTHkitccwIDAQAB");
    COUTRY_2_KEY.put("lithuania", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0LmtcuB2qn74gE4icFju4qwnViYv5bJH6gqTFkubhMDy/phX9fOGL++RAcWVdK70Q2d6hAKTOBdldkLmla/DSl4caGZTd7mngW42bXwDqhfpI2NgYy6CGzmftFhveJKNdn5QGAUfi+nk7rrRz1tk3KfOL86aRLpMygvtW11TvlTc66v1ZeFRqdHwiW0MULcZA/XFTlT9r552KkzgFotriUyc/c9MfWiOf1dACO/7o5G3z5K+xO8nTeU1fYmGJX9t6XpPKyCSCaY/IecOn9p19QdMgVnfVp7O5HXBLom7lzvOBGsll24nrRk4Gi/qrHJsMFPEcYIgUfX9FxGCNVEUMwIDAQAB");
    COUTRY_2_KEY.put("latvia", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApEIEy1WnWZ+EtHOLbWh1BE3tpPOlimkYqzcI5tk61PIVeGotWD4z1vqssHEiIe4oXb7SC8baP5qwnNsJzdOU7VcTcip7GZjKtPy29/D/AB3qsZQ6HbtmMF0XAMEvo9EjuT+qT1dyNjpDYuJrJOjVH+ys4Wp6m6nUpO8+VgxtD4fJeliXLUhungBQPZArw6J+SziZZpcDSnd2Dp68Yp9ma0hwaSYs63Cyszh3sgmcYMqejIz0Cvveth0RL/MmvWCBoMUAgO724RY0qWH7taOQa0MChCzBTvxBES/KIhz+h94Ak3zc3Km1RGshJVaL6Bor8lHDlkJ+S/J4CxxGB0DdNwIDAQAB");
    COUTRY_2_KEY.put("sri.lanka", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArkXuy09XZ1p9xIenYLOfIZBEQn/49smGnjRJt1Wntb1JWLre+AJwsDbaJ47aZyL8wQeQTcPUuy5iEXNWPT/FRKTfZolP8nhxbogv7MRAvwodcsxnlrrPShdmHiHWL81HNiX1ZLMvwzLfycoOuhWmb6J8NQjPmHSUyNPYDzd0ApmqORfcczC7bKKLNcRE9SN8LyfWih8JCEPNkWxGfC1ax8kx5FJmJ63sHKdcmJEYYJSpsHJWCvsh4UBP6t3Fau7D2Ms7TXwlNNYbtXjSKr00xFNIjHArqTs5O2ftLNyxcPhzFm5U7ezO5pmm3jIz30pIEOjOv1h9nylfiouRDvI8DQIDAQAB");
    COUTRY_2_KEY.put("hong.kong", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzonydwjfBzkeD9LxSpE+iTxBr/YN6aWNtJZx7oSW15UoHi+t4yqhTKPk8L746933AbhneEePHiLfq+qwN/lM0zoX1Ha+tOgobB81QhgmcTKR/ktMI19l1ocnA1uF59oKLQIG44pWjA+LO/i4NOkI9E4qCXya4dj6IB4jOd1q0DUcyfN18bBPEfOrpqbBAA+c9rEp0Kn6RgPPfKVSPApGoSC79ReJ8d5JgZzcmhcB65qU/6GmdSrxTaQZiMSuMyEQgp0gmXwmfVAOKjTiWMsAUmzIuk9uA7d9uh4CvL/hixeH08MgXQrP841SBDPlLKJ7OyXmLCiSdQ+nvIWA1W4FdQIDAQAB");
    COUTRY_2_KEY.put("estonia", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwclELUxwmY+ZwxiK/U7y6o//N4CMpf1AXg1pK/A0iwl8uvBpEBKJDogNYoRzqJJbkX212KKpQlZ3/9BJW87/Wm/oVv3Gk9a9JrF9fznWET5LynkL3vY/ovTCA1+XPyAGjAueBsv5ZdgaK/vWP6kjSzXrM82ccKTkJ8OyYOJVeL5tOrzsEhbRsIGacszaYdpLgzSw3SMHFNVQalqzDvOyZb+fnOmtINklFX+KHo6skm1zLH38MBa6VNCktyP8ve+an+MbKJvGQaU5Sx+c1HzrpP1Bj6dKN7+C9hf58afittQTlMOxfEN01Zd4NsCSKhZ5aG0CeLevPdc58plNyXU+5wIDAQAB");
    COUTRY_2_KEY.put("czech.republic","MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwey0Hlx2BOIHbuCB8EfEFdnk6P6IpZQG3L1IKUV4/fVUSixkoDcqiyIc1gIkEMChUX2EbbirVcznv2xsA24j5AmKONBPk9kY1xzmguBwKtPxhp/FtCJLevdMgYS3ErCueV/Q5oKjROguLAxMKtzkJpCOzaqtsqyYAIl7vZ7JfNmpo32r/5M9QCh4SWgxQDSVY6jEs/aIriwINJ96p+ybBHVmda2KeavWvx6q/GnLMMt/LVF8n9iljyZ4r3uPtcHItcvweUQKRgQm8p+t1KsnKSCAdWlvuAFb99R3AmipJxNjaS/QiD4Zfy9AP1yHHP3EX6gfutfRkrf/UqhOCVXKSwIDAQAB");
    COUTRY_2_KEY.put("czech.republic","MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArssKd2AkzgMcQJmetOQVyhHyPpyPR3BrdkCTnG3VvVxXkr6AK4DINSucBVCP7ROzNmMX8tSQR1AklxMVLCNNWduCMHdUBXWTfVvMc8RjDtcwBxQRXUkLWvi2kcFH9HFLw7g4nQxJD637mqzAFNjfUV0Sms4saAjj6pbguuxVTW5Mj8CpJffiWJEBFmTDB9nduuBKl4g31KIMljnkaBgLrdgN+NbXC4S6psoRDsZxob1GVKYFrz1e3ja3FFdlTwt14hMjjYsiARRHSKgXbhEuHPLASFVTWVUTH4jBh7u0kB0lyfLX1GTFlh2qfNOKgLjMRxR9JybqA4kh/SRY7nygjwIDAQAB");
    validateKeys();
  }

  private static void validateKeys()
  {
    if (COUTRY_2_KEY.size() != KEY_COUNT)
      throw new CopyPasteException(String
          .format("There must be %d key, found %d keys", KEY_COUNT, COUTRY_2_KEY.size()));

    // check values are different and have appropriate length
    final Set<String> rsaKeysSet = new HashSet<String>();
    for (final String country : COUTRY_2_KEY.keySet())
    {
      final String rsaKey = COUTRY_2_KEY.get(country);

      if (rsaKey.length() != KEY_LENGHT)
        throw new CopyPasteException(String
            .format("Key length %d is incorrect for %s", rsaKey.length(), country));

      if (rsaKeysSet.contains(rsaKey))
        throw new CopyPasteException(String
            .format("Possible key duplication for %s", country));

      rsaKeysSet.add(rsaKey);
    }
  }

  public static class CopyPasteException extends RuntimeException
  {
    private static final long serialVersionUID = 4067230949552311109L;

    public  CopyPasteException(String message)
    {
      super(message);
    }
  }
}
