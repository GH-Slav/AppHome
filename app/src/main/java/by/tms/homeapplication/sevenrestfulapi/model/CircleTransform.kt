package by.tms.homeapplication.sevenrestfulapi.model

import android.graphics.*
import com.squareup.picasso.Transformation;

class CircleTransform : Transformation {
    @Override
    override fun transform(source: Bitmap): Bitmap? {
        val size = Math.min(source.width, source.height)

        var x = (source.width - size) / 2
        var y = (source.height - size) / 2

        val squaredBitmap = Bitmap.createBitmap(source, x, y, size, size)
        if (squaredBitmap != source) {
            source.recycle()
        }

        val bitmap = Bitmap.createBitmap(size, size, source.config)

        val canvas = Canvas(bitmap)
        val paint = Paint()
        val shader = BitmapShader(
            squaredBitmap,
            Shader.TileMode.CLAMP, Shader.TileMode.CLAMP
        )
        paint.shader = shader
        paint.isAntiAlias = true

        val r: Float = size / 2f
        canvas.drawCircle(r, r, r, paint)

        squaredBitmap.recycle()
        return bitmap
    }

    @Override
    override fun key(): String {
        return "circle";
    }
}